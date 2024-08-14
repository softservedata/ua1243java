package task04;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private int randomNumber;

    public GuessingGame() {
        randomNumber = new Random().nextInt(100);
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int guessNumber = -1;

        while (guessNumber != randomNumber) {
            System.out.println("Enter your guess (0 - 99): ");
            try {
                guessNumber = scanner.nextInt();
                if (guessNumber < 0 || guessNumber > 99) {
                    System.out.println("Guess number out of range: (0 - 99)");
                } else if (guessNumber > randomNumber) {
                    System.out.println("Too high, try again.");
                } else if (guessNumber < randomNumber) {
                    System.out.println("Too low, try again.");
                } else {
                    System.out.println("Congratulations! You guessed it!");
                }
            } catch (InputMismatchException e) {
                System.err.println("You entered an invalid number.");
                scanner.next();
            }
        }
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }
}
