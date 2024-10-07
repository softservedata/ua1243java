package com.messenger.client;

import com.messenger.crypto.RSAEncryption;
import com.messenger.logging.CustomLogManager;

import java.io.*;
import java.net.Socket;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class Client {

    private final Socket socket;
    private final BufferedReader input;
    private final PrintWriter output;
    private final RSAEncryption rsaEncryption;
    private final String username;

    public Client(String serverAddress, int serverPort, String username) throws Exception {
        this.socket = new Socket(serverAddress, serverPort);
        this.input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.output = new PrintWriter(socket.getOutputStream(), true);
        this.username = username;

        String publicKeyBase64 = input.readLine();
        this.rsaEncryption = new RSAEncryption();
        setPublicKey(publicKeyBase64);
    }

    private void setPublicKey(String publicKeyBase64) throws Exception {
        byte[] keyBytes = Base64.getDecoder().decode(publicKeyBase64);
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(spec);
        rsaEncryption.setPublicKey(publicKey);
    }

    public void sendMessage(String message) {
        try {
            if (socket.isClosed()) {
                CustomLogManager.error("Failed to send message: socket is closed.");
                return;
            }

            String encryptedMessage = rsaEncryption.encrypt(message);

            output.println(username + ": " + encryptedMessage);
            CustomLogManager.info("Message sent: " + encryptedMessage);
        } catch (Exception e) {
            CustomLogManager.error("Failed to encrypt and send message: " + e.getMessage());
        }
    }

    public void receiveMessages(ClientView view) {
        new Thread(() -> {
            try {
                String response;
                while (!socket.isClosed() && (response = input.readLine()) != null) {
                    view.displayMessage(response);
                    CustomLogManager.info("Message received: " + response);
                }
            } catch (IOException e) {
                if (!socket.isClosed()) {
                    CustomLogManager.error("Error receiving message: " + e.getMessage());
                } else {
                    CustomLogManager.info("Client connection closed.");
                }
            }
        }).start();
    }

    public void closeConnection() {
        try {
            if (!socket.isClosed()) {
                output.println(username + " is leaving the chat.");
            }
            socket.close();
            input.close();
            output.close();
        } catch (IOException e) {
            CustomLogManager.error("Error closing connection: " + e.getMessage());
        }
    }

    public String getUsername() {
        return username;
    }
}
