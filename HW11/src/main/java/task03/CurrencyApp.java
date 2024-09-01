package task03;

import java.util.List;
import java.util.Scanner;

public class CurrencyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter text containing US currency formats:");
        String text = scanner.nextLine();

        CurrencyPatternMatcher matcher = new CurrencyPatternMatcher();
        System.out.println("Found currency formats: ");
        List<String> matchesCurrencies = matcher.currencyMatches(text);

        if(!matchesCurrencies.isEmpty())
            matchesCurrencies.forEach(System.out::println);
        else
            System.out.println("Currency not found.");

        scanner.close();
    }
}


