import java.util.Scanner;

public class pr1_lesson11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String String1 = scan.nextLine();

        System.out.print("Enter the second string: ");
        String String2 = scan.nextLine();

        boolean isSubstring = String2.contains(String1);

        System.out.println("Is the first string a substring of the second string? " + isSubstring);
    }
}
