package task02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumCalculatorApp {

    public static void main(String[] args) {
        runCalculator();
    }

    public static void runCalculator() {
        try (Scanner sc = new Scanner(System.in)) {
            String input;
            do {
                System.out.println("Enter first number: ");
                int firstNumber = sc.nextInt();
                System.out.println("Enter second number: ");
                int secondNumber = sc.nextInt();
                int sum = firstNumber + secondNumber;
                System.out.println("The sum is: " + sum);
                System.out.println("Do you want to continue? (Y/N): ");
                input = sc.next();
            } while (input.equalsIgnoreCase("Y"));
        } catch (InputMismatchException e) {
            System.err.println("You entered an invalid number.");
        }
        System.out.println("Program terminated!");
    }
}
