package task01and02;

import java.util.Scanner;

public class SentenceManagerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            boolean validInput = false;

            while (!validInput) {
                System.out.println("Please enter a sentence with exactly five words:");
                String sentence = scanner.nextLine();
                try {
                    SentenceManager sentenceManager = new SentenceManager(sentence);

                    System.out.println("The longest word: " + sentenceManager.getLongestWord());
                    System.out.println("The number of letters in the longest word: " + sentenceManager.getLengthLongestWord());
                    System.out.println("The second reversed word: " + sentenceManager.getReversedSecondWord());
                    System.out.println("The sentence with single space: " + sentenceManager.getSentenceWithOneSpace());

                    validInput = true;
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage());
                    System.out.println("Please, try again.");
                }
            }
        scanner.close();
    }
}

