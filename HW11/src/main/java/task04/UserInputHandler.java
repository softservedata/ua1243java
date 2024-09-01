package task04;

import java.util.Scanner;

public class UserInputHandler {
    private final Scanner scanner;

    public UserInputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public String promptAndValidateName(String nameType) {
        String name;
        boolean isValid;

        do {
            System.out.printf("Please, input your %s: ", nameType);
            name = scanner.nextLine().trim();
            isValid = NameValidator.isValid(name);

            if (!isValid) {
                System.out.printf("Your %s is incorrect. Please try again.%n%n", nameType);
            }
        } while (!isValid);

        return capitalizeFirstLetter(name);
    }

    private String capitalizeFirstLetter(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }

        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
