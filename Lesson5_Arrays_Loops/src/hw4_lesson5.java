import java.util.Random;
import java.util.Scanner;

public class hw4_lesson5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;
        int userGuess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scan.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low, try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations!");
            }
        }
        scan.close();
    }
}
