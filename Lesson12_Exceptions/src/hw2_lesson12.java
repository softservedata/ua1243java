import java.util.Scanner;

public class hw2_lesson12 {
    public static int readNumber(int start, int end) throws IllegalArgumentException {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter a number between " + start + " and " + end + ": ");
            int number = Integer.parseInt(scan.nextLine());

            if (number <= start || number >= end) {
                throw new IllegalArgumentException("Number must be in the range [" + (start + 1) + "..." + (end - 1) + "]");
            }

            return number;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input, please enter a numeric value.");
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int start = 1;
        int end = 100;

        try {
            for (int i = 0; i < 10; i++) {
                numbers[i] = readNumber(start, end);
                start = numbers[i];
            }

            System.out.println("The numbers entered are:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
