package com.messenger.client;

import com.messenger.logging.CustomLogManager;

import javax.swing.*;
import java.awt.*;

public class UserAuthentication {

    private JFrame frame;

    public void showLoginWindow(String serverAddress, int serverPort) {
        frame = new JFrame("Chat Login");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel label = new JLabel("Enter your name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        frame.add(label, gbc);

        JTextField usernameField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        frame.add(usernameField, gbc);

        JButton loginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        frame.add(loginButton, gbc);

        JButton cancelButton = new JButton("Cancel");
        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(cancelButton, gbc);

        usernameField.addActionListener(_ -> attemptLogin(usernameField.getText(), serverAddress, serverPort));

        loginButton.addActionListener(_ -> attemptLogin(usernameField.getText(), serverAddress, serverPort));

        cancelButton.addActionListener(_ -> frame.dispose());

        frame.setVisible(true);
    }

    private void attemptLogin(String username, String serverAddress, int serverPort) {
        if (username.trim().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!isValidUsername(username)) {
            JOptionPane.showMessageDialog(frame, "Username contains invalid characters!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        frame.dispose();
        try {
            ClientView.launchClientView(serverAddress, serverPort, username);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Failed to connect to the server.", "Connection Error", JOptionPane.ERROR_MESSAGE);
            CustomLogManager.error("Client connection error: " + ex.getMessage());
        }
    }

    private boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z0-9_]+$");
    }

    public static void main(String[] args) {
        UserAuthentication auth = new UserAuthentication();
        auth.showLoginWindow("localhost", 12345);
    }
}
