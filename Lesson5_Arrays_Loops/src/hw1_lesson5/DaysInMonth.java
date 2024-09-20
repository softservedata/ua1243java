package hw1_lesson5;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = scan.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month number.");
        } else {
            System.out.println("Number of days: " + daysInMonth[month - 1]);
        }
        scan.close();
    }
}