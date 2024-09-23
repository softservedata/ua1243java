import java.util.Random;
import java.util.Scanner;

public class hw4_lesson11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        String namePattern = "^[a-zA-Z\\s-]+$";

        while (true) {
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine();
            if (firstName.matches(namePattern)) {
                break;//valid
            } else {
                System.out.println("Invalid input. Please use only English letters, spaces, or hyphens.");
            }
        }

        while (true) {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine();
            if (lastName.matches(namePattern)) {
                break; //valid
            } else {
                System.out.println("Invalid input. Please use only English letters, spaces, or hyphens.");
            }
        }

        String[] greetings = {
                "Hello, %s %s! Welcome!",
                "Greetings, %s %s! How are you today?",
                "Hi, %s %s! Nice to meet you!",
                "Welcome, %s %s! Have a great day!",
                "Good day, %s %s! Enjoy your time!"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(greetings.length);
        String greetingMessage = String.format(greetings[randomIndex], firstName, lastName);

        System.out.printf("%s%n", greetingMessage);
    }
}
