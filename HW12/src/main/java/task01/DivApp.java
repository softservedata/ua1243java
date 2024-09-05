package task01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivApp {
    public static void main(String[] args) {
        try {
            double a = readDouble("Enter the first number: ");
            double b = readDouble("Enter the second number: ");

            double divisionResult = division(a, b);
            System.out.println("Division result: " + divisionResult);

        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static double division(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        return a / b;
    }

    public static double readDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("Error: Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }
}
