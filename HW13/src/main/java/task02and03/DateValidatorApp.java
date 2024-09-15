package task02and03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DateValidatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.add("31.12.2023");
        list.add("19.02.2020");
        list.add("31.04.2022");
        list.add("15.07.2021");
        list.add("01.13.2021");

        System.out.println("Start dates:");
        list.forEach(System.out::println);

        List<String> validDates = DateValidator.validateDates(list);
        System.out.println("Valid dates:");
        validDates.forEach(System.out::println);

        while (true) {
            System.out.print("Please, input date in dd.MM.yyyy format: ");
            String inputDate = scanner.nextLine();
            if (DateValidator.isValidDate(inputDate)) {
                System.out.println("Your date is valid.");

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                LocalDate parsedDate = LocalDate.parse(inputDate, formatter);
                int year = parsedDate.getYear();

                if (DateValidator.isLeap(year)) {
                    System.out.println("The year " + year + " is a leap year.");
                } else {
                    System.out.println("The year " + year + " is not a leap year.");
                }

                break;
            } else {
                System.out.println("Your date is not valid. Try again.");
            }
        }

        List<Integer> years = Arrays.asList(2000, 2001, 2004, 1900, 2020, 2023);
        System.out.println("List of years: ");
        years.forEach(System.out::println);

        List<Integer> leapYears = DateValidator.leapYears(years);
        System.out.println("Leap years from the list: " + leapYears);

        scanner.close();
    }
}
