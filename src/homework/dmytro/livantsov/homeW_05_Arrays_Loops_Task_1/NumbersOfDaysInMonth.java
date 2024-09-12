package homework.dmytro.livantsov.homeW_05_Arrays_Loops_Task_1;

import java.util.Scanner;

public class NumbersOfDaysInMonth {

    public static void howManyDaysInMonth() {

        int[] arrayDaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("\nWrite the number of the month if u want to now how many days in this month.");
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();

        if (numberOfMonth >= 1 || numberOfMonth <= 12) {
            System.out.println("Number of days in this month is " + arrayDaysInMonth[numberOfMonth-1]);
        } else {
            throw new IllegalArgumentException("Wrong number of the month");
        }
    }
}
