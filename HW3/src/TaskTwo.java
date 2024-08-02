import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Input the first number: ");
            int firstNumber = sc.nextInt();
            System.out.print("Input the second number: ");
            int secondNumber = sc.nextInt();
            System.out.print("Input the third number: ");
            int thirdNumber = sc.nextInt();
            System.out.println("The smallest number is " + getMinInteger(firstNumber, secondNumber, thirdNumber));
        } catch (InputMismatchException e){
            System.err.println("Invalid input. Please enter valid numbers.");
        }

    }
    public static int getMinInteger(int firstNumber, int secondNumber, int thirdNumber) {
        return Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
    }
}
