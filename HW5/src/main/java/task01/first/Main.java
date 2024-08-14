package task01.first;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a number of the month: ");
        int monthNumber = SCANNER.nextInt();
        System.out.println("Please enter a number of the year: ");
        int year = SCANNER.nextInt();

        int daysInMonth = DaysInMonthCalculator.getDaysInMonth(monthNumber, year);
        String monthInfo = DaysInMonthCalculator.getMonthInfo(monthNumber);

        if (daysInMonth != -1) {
            System.out.println("Information about the month:");
            System.out.println(monthInfo + ", days in the month: " + daysInMonth);
        } else {
            System.out.println(monthInfo);
        }
    }
}
