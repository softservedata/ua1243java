import java.util.Scanner;

public class pr3_lesson11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String usernameRegex = "^[a-zA-Z0-9_]{3,15}$";

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter username " + i + ": ");
            String username = scan.nextLine();

            if (username.matches(usernameRegex)) {
                System.out.println("Username " + i + " is valid.");
            } else {
                System.out.println("Username " + i + " is not valid.");
            }
        }
    }
}
