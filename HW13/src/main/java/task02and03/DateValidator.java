package task02and03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class DateValidator {

    private static final String DATE_PATTERN = "dd.MM.yyyy";

    public static boolean isValidDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        try {
            LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static List<String> validateDates(List<String> dates){
        return dates.stream()
                .filter(DateValidator::isValidDate)
                .toList();
    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static List<Integer> leapYears(List<Integer> years) {
        return years.stream()
                .filter(DateValidator::isLeap)
                .toList();
    }
}
