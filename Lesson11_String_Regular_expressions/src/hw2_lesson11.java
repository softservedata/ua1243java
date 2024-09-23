import java.util.Scanner;

public class hw2_lesson11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence with words separated by multiple spaces:");
        String sentence = scan.nextLine();

        String cleanedSentence = sentence.replaceAll("\\s+", " ");

        System.out.println("Sentence with single spaces: " + cleanedSentence);
    }
}
