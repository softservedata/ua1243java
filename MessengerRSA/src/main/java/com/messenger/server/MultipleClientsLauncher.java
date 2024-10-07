package com.messenger.server;

import com.messenger.client.UserAuthentication;
import com.messenger.logging.CustomLogManager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultipleClientsLauncher {

    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;
    private static final int CLIENT_COUNT = 3;

    public static void main(String[] args) {
        CustomLogManager.info("Starting " + CLIENT_COUNT + " clients...");

        ExecutorService executorService = Executors.newFixedThreadPool(CLIENT_COUNT);

        for (int i = 1; i <= CLIENT_COUNT; i++) {
            final int clientId = i;
            executorService.submit(() -> {
                try {
                    CustomLogManager.info("Launching client #" + clientId);
                    UserAuthentication auth = new UserAuthentication();
                    auth.showLoginWindow(SERVER_ADDRESS, SERVER_PORT);  // Server address and port
                } catch (Exception e) {
                    CustomLogManager.error("Error launching client #" + clientId + ": " + e.getMessage());
                }
            });
        }
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                CustomLogManager.error("The timeout for waiting for clients to terminate has expired.");
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            CustomLogManager.error("Waiting for clients to terminate was interrupted: " + e.getMessage());
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }

        CustomLogManager.info("All clients were successfully launched.");
    }
}
