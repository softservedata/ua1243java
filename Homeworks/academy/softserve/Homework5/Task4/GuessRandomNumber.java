package academy.softserve.Homework5.Task4;


import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int x = random.nextInt(1000) + 1;
        int choose;
        do {
            System.out.printf("Enter your number: ");
            choose = scan.nextInt();
            if (x == choose) {
                System.out.println("Yes! You won!");
            } else {
                if (x > choose) {
                    System.out.println("Too low, try again!");
                }else {
                    System.out.println("Too high, try again");
                }
            }
        } while (x != choose);
    }
}
