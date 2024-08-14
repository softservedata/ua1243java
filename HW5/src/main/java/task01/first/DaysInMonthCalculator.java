package task01.first;

public class DaysInMonthCalculator {

    private static final Month[] months = Month.values();

    public static int getDaysInMonth(int monthNumber, int year) {
        try {
            if (isLeapYear(year) && monthNumber == 2) {
                return months[monthNumber - 1].getDays() + 1;
            } else {
                return months[monthNumber - 1].getDays();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid month number: " + monthNumber);
            return -1;
        }
    }

    private static boolean isLeapYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be a positive integer.");
        }
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static String getMonthInfo(int monthNumber) {
        try {
            Month month = months[monthNumber - 1];
            return month.toString();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid month number: " + monthNumber);
            return null;
        }
    }
}
