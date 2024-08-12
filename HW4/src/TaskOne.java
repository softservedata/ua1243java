import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNumber, secondNumber, thirdNumber;

        try {
            System.out.print("Enter first number: ");
            firstNumber = sc.nextDouble();

            System.out.print("Enter second number: ");
            secondNumber = sc.nextDouble();

            System.out.print("Enter third number: ");
            thirdNumber = sc.nextDouble();

            boolean firstInRange = isInRange(firstNumber, -5, 5);
            boolean secondInRange = isInRange(secondNumber, -5, 5);
            boolean thirdInRange = isInRange(thirdNumber, -5, 5);

            if (firstInRange && secondInRange && thirdInRange) {
                System.out.println("All numbers belong to the range [-5;5]");
            } else {
                System.out.println("Not all numbers belong to the range [-5;5]");
                if (!firstInRange) {
                    System.out.println("First number " + firstNumber + " does not belong to the range [-5;5]");
                }
                if (!secondInRange) {
                    System.out.println("Second number " + secondNumber + " does not belong to the range [-5;5]");
                }
                if (!thirdInRange) {
                    System.out.println("Third number " + thirdNumber + " does not belong to the range [-5;5]");
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter valid numbers.");
        }
    }

    public static boolean isInRange(double number, double min, double max) {
        return number >= min && number <= max;
    }
}
