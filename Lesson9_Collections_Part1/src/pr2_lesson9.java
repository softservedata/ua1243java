import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class pr2_lesson9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a set of numbers separated by commas:");

        String input = scan.nextLine();

        String[] numbers = input.split(",");

        Set<String> uniqueNumbers = new LinkedHashSet<>();

        for (String number : numbers) {
            uniqueNumbers.add(number.trim());
        }

        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}
