package task04;
import java.time.LocalDate;
import java.time.Period;

public class DateManager {

    private static final Period HALF_YEAR = Period.ofMonths(6);

    private static final Period ONE_YEAR = Period.ofYears(1);

    public static void printDayOfWeek(LocalDate date){
        System.out.println("The day of the week: " + date.getDayOfWeek());
    }

    public static void printDayOfWeekAfterHalfYear(LocalDate date) {
        System.out.println("The day of the week after half year: " + date.plus(HALF_YEAR).getDayOfWeek());
    }

    public static void printDayOfWeekAfterYear(LocalDate date){
        System.out.println("The day of the week after one year: " + date.plus(ONE_YEAR).getDayOfWeek());
    }

    public static void printDayOfWeekInfo(LocalDate date){
        printDayOfWeek(date);
        printDayOfWeekAfterHalfYear(date);
        printDayOfWeekAfterYear(date);
    }
}
