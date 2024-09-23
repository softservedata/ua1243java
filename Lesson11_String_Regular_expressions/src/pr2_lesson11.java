import java.util.Scanner;

public class pr2_lesson11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your last name: ");
        String lastName = scan.nextLine();

        System.out.print("Enter your first name: ");
        String firstName = scan.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = scan.nextLine();

        String initials = firstName.charAt(0) + "." + middleName.charAt(0) + ".";
        System.out.println("Last name and initials: " + lastName + " " + initials);

        System.out.println("First name: " + firstName);

        System.out.println("Full name: " + firstName + " " + middleName + " " + lastName);
    }
}
