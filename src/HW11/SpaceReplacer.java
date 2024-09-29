package HW11;

import java.util.Scanner;

public class SpaceReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with words separated by more than one space:");
        String sentence = scanner.nextLine();

        String result = sentence.replaceAll("\\s+", " ");

        System.out.println("Result after replacing consecutive spaces:");
        System.out.println(result);
    }
}
