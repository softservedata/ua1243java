package com.messenger.server;

import com.messenger.crypto.RSAEncryption;
import com.messenger.logging.CustomLogManager;
import com.messenger.storage.MessageStorage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Base64;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private static final int PORT = 12345;
    private static List<String> messageHistory;
    private static ServerView serverView;
    private static RSAEncryption rsaEncryption;
    private static final ExecutorService clientPool = Executors.newCachedThreadPool();
    private static final List<ClientHandler> clients = new CopyOnWriteArrayList<>();

    public static void startServer(ServerView view) {
        serverView = view;
        messageHistory = MessageStorage.loadMessages();

        try {
            rsaEncryption = new RSAEncryption();
        } catch (NoSuchAlgorithmException e) {
            logAndDisplay("Failed to generate RSA keys: " + e.getMessage());
            return;
        }

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            logAndDisplay("Server started on port: " + PORT);

            while (!serverSocket.isClosed()) {
                Socket clientSocket = serverSocket.accept();
                logAndDisplay("New client connected: " + clientSocket.getInetAddress());

                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clientPool.submit(clientHandler);
                clients.add(clientHandler);
            }
        } catch (IOException e) {
            CustomLogManager.error("Server error: " + e.getMessage());
        } finally {
            stopServer();
        }
    }

    public static void stopServer() {
        try {
            logAndDisplay("Stopping the server...");
            clientPool.shutdownNow();
            MessageStorage.saveMessages(messageHistory);
            logAndDisplay("Server stopped.");
        } catch (Exception e) {
            CustomLogManager.error("Error stopping the server: " + e.getMessage());
        }
    }

    public static void broadcastMessage(String message, ClientHandler sender) {
        messageHistory.add(message);
        for (ClientHandler client : clients) {
            if (client != sender) {
                client.sendMessage(message);
            }
        }
        logAndDisplay("Broadcasting message: " + message);
    }

    public static List<String> getMessageHistory() {
        return messageHistory;
    }

    private static void logAndDisplay(String logMessage) {
        serverView.logMessage(logMessage);
        CustomLogManager.info(logMessage);
    }

    private static class ClientHandler implements Runnable {
        private final Socket socket;
        private final BufferedReader input;
        private final PrintWriter output;

        public ClientHandler(Socket socket) throws IOException {
            this.socket = socket;
            this.input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.output = new PrintWriter(socket.getOutputStream(), true);

            sendPublicKeyToClient();
            sendHistoryToClient();
        }

        private void sendPublicKeyToClient() {
            String publicKeyBase64 = Base64.getEncoder().encodeToString(rsaEncryption.getPublicKey().getEncoded());
            output.println(publicKeyBase64);
        }

        private void sendHistoryToClient() {
            messageHistory.forEach(output::println);
        }

        @Override
        public void run() {
            try {
                String message;
                while ((message = input.readLine()) != null) {
                    if (message.contains("is leaving the chat")) {
                        logAndDisplay(message);
                        Server.broadcastMessage(message, this);
                        break;
                    }

                    logAndDisplay("Received encrypted message from client: " + message);

                    String[] parts = message.split(": ", 2);
                    if (parts.length != 2) {
                        logAndDisplay("Error: Incorrect message format");
                        continue;
                    }

                    String username = parts[0].trim();
                    String encryptedPart = parts[1].trim();

                    try {
                        String decryptedMessage = rsaEncryption.decrypt(encryptedPart);
                        logAndDisplay("Decrypted message from " + username + ": " + decryptedMessage);
                        Server.broadcastMessage(username + ": " + decryptedMessage, this);
                    } catch (Exception e) {
                        logAndDisplay("Decryption error: " + e.getMessage());
                    }
                }
            } catch (IOException e) {
                logAndDisplay("Client disconnected: " + e.getMessage());
            } finally {
                closeConnection();
            }
        }

        private void closeConnection() {
            try {
                socket.close();
                input.close();
                output.close();
                clients.remove(this);
            } catch (IOException e) {
                logAndDisplay("Failed to close client socket: " + e.getMessage());
            }
        }

        public void sendMessage(String message) {
            output.println(message);
        }
    }
}
