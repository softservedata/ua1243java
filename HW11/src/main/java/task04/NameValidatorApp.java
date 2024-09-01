package task04;

import java.util.Scanner;

public class NameValidatorApp {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        UserInputHandler userInputHandler = new UserInputHandler(SCANNER);

        String firstName = userInputHandler.promptAndValidateName("first name");
        String lastName = userInputHandler.promptAndValidateName("last name");

        System.out.printf("%s%n", Greetings.getRandomGreeting(firstName, lastName));

        SCANNER.close();
    }
}
