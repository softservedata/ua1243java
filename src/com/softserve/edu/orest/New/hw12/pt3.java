package com.softserve.edu.orest.New.hw12;

import java.util.Scanner;

public class pt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter username: ");
            String username = scanner.nextLine();

            boolean isValid = validate(username);
            if (isValid) {
                System.out.printf("Username '%s' is valid%n", username);
            } else {
                System.out.printf("Username '%s' is invalid%n", username);

            }
        }
    }

    private static boolean validate(String username) {
        return username.matches("//w{3,15}");
    }
}
