package task04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateManagerApp {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input your birthday (dd.MM.yyyy): ");
            String birthDayStr = scanner.nextLine();

            try {
                LocalDate birthDay = LocalDate.parse(birthDayStr, DATE_FORMAT);
                DateManager.printDayOfWeekInfo(birthDay);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use dd.MM.yyyy. Try again.");
            }
        }
        scanner.close();
    }
}
