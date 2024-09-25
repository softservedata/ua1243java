import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class hw4_lesson13 {
    static LocalDate birthday = LocalDate.of(2024, 9, 25);

    public static void printBirthdayInfo(LocalDate date) {
        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("Day of the week for " + date + ": " + dayOfWeek);

        LocalDate sixMonthsLater = date.plusMonths(6);
        String dayOfWeekAfterSixMonths = sixMonthsLater.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("Day of the week after 6 months (" + sixMonthsLater + "): " + dayOfWeekAfterSixMonths);

        LocalDate twelveMonthsLater = date.plusMonths(12);
        String dayOfWeekAfterTwelveMonths = twelveMonthsLater.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("Day of the week after 12 months (" + twelveMonthsLater + "): " + dayOfWeekAfterTwelveMonths);
    }

    public static void main(String[] args) {
        printBirthdayInfo(birthday);
    }
}
