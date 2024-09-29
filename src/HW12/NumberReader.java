package HW12;

import java.util.Scanner;

public class NumberReader {

    public static int readNumber(int start, int end) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < start || number > end) {
                throw new IllegalArgumentException("Number not in range: " + start + " to " + end);
            }

            return number;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int start = 1, end = 100;

        System.out.println("Enter 10 numbers such that 1 < a1 < a2 < ... < a10 < 100:");

        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    if (i == 0) {
                        System.out.print("Enter number a" + (i + 1) + ": ");
                        numbers[i] = readNumber(start + 1, end - 1);
                    } else {

                        System.out.print("Enter number a" + (i + 1) + ": ");
                        numbers[i] = readNumber(numbers[i - 1] + 1, end - 1);
                    }
                    break;

                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        // Display the entered numbers
        System.out.println("The 10 numbers entered are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
