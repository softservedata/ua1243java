import java.util.Scanner;
import java.util.InputMismatchException;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber, secondNumber, thirdNumber;
        try{
            System.out.print("Enter first number: ");
            firstNumber = sc.nextInt();

            System.out.print("Enter second number: ");
            secondNumber = sc.nextInt();

            System.out.print("Enter third number: ");
            thirdNumber = sc.nextInt();

            System.out.println("Maximum number is " + maximumNumber(firstNumber, secondNumber, thirdNumber));
            System.out.println("Minimum number is " + minimumNumber(firstNumber, secondNumber, thirdNumber));
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter valid numbers.");
        }
    }
    public static int maximumNumber(int firstNumber, int secondNumber, int thirdNumber){
        return Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
    }
    public static int minimumNumber(int firstNumber, int secondNumber, int thirdNumber){
        return Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
    }

}
