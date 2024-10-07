package com.messenger.server;

import com.messenger.storage.MessageStorage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ServerView {

    private JTextArea logArea;
    private JButton stopButton;
    private boolean serverRunning;
    private JFrame frame;

    public ServerView() {
        createServerWindow();
    }

    private void createServerWindow() {
        frame = new JFrame("Chat Server");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                stopServerWithConfirmation();
            }
        });

        frame.setLayout(new BorderLayout());

        logArea = new JTextArea();
        logArea.setEditable(false);
        logArea.setFont(new Font("Arial", Font.PLAIN, 14));

        JScrollPane logScroll = new JScrollPane(logArea);
        frame.add(logScroll, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        frame.add(controlPanel, BorderLayout.SOUTH);

        stopButton = new JButton("Stop Server");
        stopButton.setEnabled(false);
        stopButton.addActionListener(_ -> stopServerWithConfirmation());
        controlPanel.add(stopButton);

        frame.setVisible(true);
    }

    private void stopServerWithConfirmation() {
        if (serverRunning) {
            int confirm = JOptionPane.showConfirmDialog(
                    frame,
                    "Are you sure you want to close the server?",
                    "Server Shutdown",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.YES_OPTION) {
                logMessage("Stopping the server. Saving history...");
                MessageStorage.saveMessages(Server.getMessageHistory());
                new Thread(() -> {
                    Server.stopServer();
                    serverRunning = false;
                    stopButton.setEnabled(false);
                    logMessage("Server stopped.");
                    closeServerWindow();
                    System.exit(0);
                }).start();
            }
        }
    }

    private void closeServerWindow() {
        SwingUtilities.invokeLater(() -> frame.dispose());
    }

    public void logMessage(String message) {
        logArea.append(message + "\n");
        logArea.setCaretPosition(logArea.getDocument().getLength());
    }

    public void startServer() {
        new Thread(() -> {
            try {
                serverRunning = true;
                stopButton.setEnabled(true);
                Server.startServer(this);
            } catch (Exception e) {
                logMessage("Error starting the server: " + e.getMessage());
                serverRunning = false;
            }
        }).start();
    }

    public static void main(String[] args) {
        ServerView serverView = new ServerView();
        serverView.startServer();
    }
}
