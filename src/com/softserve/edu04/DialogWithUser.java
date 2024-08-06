package com.softserve.edu04;

import java.util.Scanner;

public class DialogWithUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you enjoy Java? (yes/no/maybe)");
        String input = sc.nextLine();
        String result = switch (input.toLowerCase()) {
            case "yes", "maybe" -> "Great!";
            case "no" -> "Too bad!";
            default -> "Wrong!";
        };
        System.out.println(result);
        sc.close();
    }
}
