package com.messenger.storage;

import com.messenger.logging.CustomLogManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MessageStorage {

    private static final String FILE_NAME = "message_history.dat";

    public static void saveMessages(List<String> messages) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(messages);
            CustomLogManager.info("Message history has been saved.");
        } catch (IOException e) {
            CustomLogManager.error("Error saving message history: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<String> loadMessages() {
        List<String> messages = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            CustomLogManager.info("Message history file not found, a new one will be created.");
            return messages;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            messages = (List<String>) ois.readObject();
            CustomLogManager.info("Message history has been restored.");
        } catch (IOException e) {
            CustomLogManager.error("Error reading message history: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            CustomLogManager.error("Error: Message history class not found: " + e.getMessage());
        }
        return messages;
    }
}
