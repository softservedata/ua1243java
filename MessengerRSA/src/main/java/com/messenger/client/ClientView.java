package com.messenger.client;

import com.messenger.logging.CustomLogManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClientView {

    private final Client client;
    private JTextArea chatArea;
    private JTextField messageField;

    public ClientView(Client client) {
        this.client = client;
        createChatWindow();
        client.receiveMessages(this);
    }

    public static void launchClientView(String serverAddress, int serverPort, String username) {
        try {
            Client client = new Client(serverAddress, serverPort, username);
            new ClientView(client);
        } catch (Exception e) {
            CustomLogManager.error("Error launching client view: " + e.getMessage());
        }
    }

    private void createChatWindow() {
        JFrame frame = new JFrame("Client Chat - " + client.getUsername());
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  // Disable standard closing

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(
                        frame,
                        "Are you sure you want to exit?",
                        "Close Client",
                        JOptionPane.YES_NO_OPTION
                );

                if (confirm == JOptionPane.YES_OPTION) {
                    client.closeConnection();
                    frame.dispose();
                }
            }
        });

        frame.setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 14));

        JScrollPane chatScroll = new JScrollPane(chatArea);
        frame.add(chatScroll, BorderLayout.CENTER);

        messageField = new JTextField();
        messageField.setFont(new Font("Arial", Font.PLAIN, 14));
        messageField.addActionListener(_ -> sendMessage());

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(_ -> sendMessage());

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(messageField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void sendMessage() {
        String message = messageField.getText();
        if (!message.isEmpty()) {
            client.sendMessage(message);
            chatArea.append("You: " + message + "\n");
            messageField.setText("");
            chatArea.setCaretPosition(chatArea.getDocument().getLength());
        }
    }

    public void displayMessage(String message) {
        chatArea.append(message + "\n");
        chatArea.setCaretPosition(chatArea.getDocument().getLength());
    }
}
