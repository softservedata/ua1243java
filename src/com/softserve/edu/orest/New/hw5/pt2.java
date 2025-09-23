package com.softserve.edu.orest.New.hw5;

import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }

    public static boolean isPrime(int number) {
        if (number < 0) number = -number;
        if (number == 1) return false;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
