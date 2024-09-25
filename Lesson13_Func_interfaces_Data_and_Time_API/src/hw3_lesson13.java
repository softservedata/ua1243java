import java.time.Year;

public class hw3_lesson13 {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static boolean isLeapYear2(int year) {
        return Year.isLeap(year);
    }

    public static void main(String[] args) {
        int year1 = 2020;
        int year2 = 1900;
        int year3 = 2000;
        int year4 = 2023;

        System.out.println(year1 + " is a leap year: " + isLeapYear(year1));
        System.out.println(year2 + " is a leap year: " + isLeapYear(year2));
        System.out.println(year3 + " is a leap year: " + isLeapYear(year3));
        System.out.println(year4 + " is a leap year: " + isLeapYear(year4));
        System.out.println("-------------------------------");
        System.out.println(year1 + " is a leap year: " + isLeapYear2(year1));
        System.out.println(year2 + " is a leap year: " + isLeapYear2(year2));
        System.out.println(year3 + " is a leap year: " + isLeapYear2(year3));
        System.out.println(year4 + " is a leap year: " + isLeapYear2(year4));
    }
}
