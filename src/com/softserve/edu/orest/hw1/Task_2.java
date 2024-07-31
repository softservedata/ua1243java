package com.softserve.edu.orest.hw1;

import java.util.Scanner;

// Write a program that takes three numbers from console as input to calculate and print output the average of the numbers
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 digits");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double sum = a + b + c;

        System.out.println(sum/3);

    }
}