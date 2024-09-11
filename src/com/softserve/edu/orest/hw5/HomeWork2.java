package com.softserve.edu.orest.hw5;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ask;
        do {
            System.out.println("Enter 2 numbers:");

            int[] numbers = new int[2];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("The sum is " + sum);
            System.out.println("Do you want to perform the operation again?");
            ask = scanner.next();
        } while (ask.equalsIgnoreCase("yes") || ask.equalsIgnoreCase("так"));
    }
}
