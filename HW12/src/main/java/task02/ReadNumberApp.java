package task02;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumberApp {

    public static final int START = 1;
    public static final int END = 100;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers such that 1 < a1 < ... < a10 < 100:");

        for (int i = 0; i < numbers.length; i++) {
            boolean isValid = false;
            while (!isValid) {
                try {
                    numbers[i] = readNumber(scanner, START, END);
                    if (i > 0 && numbers[i] <= numbers[i - 1]) {
                        System.out.println("Each number must be greater than the previous one. Try again.");
                    } else {
                        isValid = true;
                    }
                } catch (NumberOutOfRangeException | InputMismatchException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("You entered a valid sequence of numbers:");
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }

    public static int readNumber(Scanner scanner, int start, int end) throws NumberOutOfRangeException {

        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("Enter a number between " + start + " and " + end + ":");
            try {
                number = scanner.nextInt();
                if (number <= start || number >= end) {
                    throw new NumberOutOfRangeException("Number out of range. It must be between " + start + " and " + end + ".");
                }
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        }

        return number;
    }
}

