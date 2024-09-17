package HW5;
import java.util.Scanner;

public class SumWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userResponse;

        do {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum of the two numbers is: " + sum);

            System.out.print("Do you want to perform another operation? (yes/no): ");
            userResponse = scanner.next().toLowerCase();

            } while (userResponse.equals("yes"));

        System.out.println("Program terminated.");
        }
    }

