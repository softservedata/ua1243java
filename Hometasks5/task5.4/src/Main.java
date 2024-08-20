
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        generateRandomNumbers();
}



    static void generateRandomNumbers(){
        Random rnd = new Random();

          int randomNumber= rnd.nextInt(0,100);
        for (int i = 0; i < 20; i++) {
            System.out.println("Please,guess a number:");
            int guessNumber = SCANNER.nextInt();
            if (guessNumber == randomNumber) {
                System.out.println("You win!");
                break;
            } else if (guessNumber < randomNumber) {
                System.out.println("Too low, try again.");
            } else  {
                System.out.println("Too high, try again. ");

            }
        }


    }
}