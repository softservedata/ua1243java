package HW12;

import java.util.Scanner;

public class DivisionCalculator {

    public static double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the first number:");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the second number:");
            double num2 = Double.parseDouble(scanner.nextLine());

            double result = div(num1, num2);
            System.out.println("The result of the division is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid double numbers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
