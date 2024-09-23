import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw3_lesson11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a text containing US currency format:");
        String text = scan.nextLine();

        String currencyPattern = "\\$\\d+(\\.\\d{2})?";

        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Occurrences of US currency format:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
