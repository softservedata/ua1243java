package task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Please, enter the sentences that contains words separated by more than one space:");
        String sentences = scan.nextLine();
        scan.close();
        System.out.println("Thank you!");
        String newSentences = sentences. replaceAll(" +", " ");
        System.out.println("New sentences: " + newSentences);
    }
}

