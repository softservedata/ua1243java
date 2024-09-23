import java.util.Scanner;

public class hw1_lesson11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence with exactly five words:");
        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");

        if (words.length != 5) {
            System.out.println("Error: The sentence must contain exactly five words.");
            return;
        }

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        int longestWordLength = longestWord.length();

        System.out.println("The longest word is: " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestWordLength);

        String secondWord = words[1];
        String reversedSecondWord = new StringBuilder(secondWord).reverse().toString();

        System.out.println("The second word in reverse order is: " + reversedSecondWord);
    }
}
