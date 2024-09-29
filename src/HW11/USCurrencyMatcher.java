package HW11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USCurrencyMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text containing several instances of US currency format:");
        String inputText = scanner.nextLine();

        String currencyPattern = "\\$\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(currencyPattern);

        Matcher matcher = pattern.matcher(inputText);

        System.out.println("Occurrences of US currency format in the input text:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No US currency format found in the input text");
        }
    }
}
