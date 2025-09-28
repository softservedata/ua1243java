package com.softserve.edu.orest.New.hw8;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter first double number: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter second double number: ");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("The result of dividing is " + div(a, b));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Should be a number");
            } catch (ArithmeticException e1) {
                throw new ArithmeticException(e1.getMessage());
            }
        }
    }

    static double div(double a, double b) {
        return a / b;
    }
}
