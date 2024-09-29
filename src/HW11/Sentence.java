package HW11;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with exactly five words:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        if (words.length != 5) {
            System.out.println("Please enter a sentence with exactly five words.");
            return;
        }

        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        int longestWordLength = longestWord.length();

        String secondWord = words[1];
        String reversedSecondWord = new StringBuilder(secondWord).reverse().toString();

        System.out.println("Longest word is " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestWordLength);
        System.out.println("Second word in reverse is " + reversedSecondWord);
    }
}
