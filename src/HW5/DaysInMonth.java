package HW5;
import java.util.Scanner;

public class DaysInMonth {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            System.out.print("Enter the month number (1-12): ");
            int month = scanner.nextInt();

            if (month >= 1 && month <= 12) {
                System.out.println("Number of days in month: " + daysInMonth[month - 1]);
            } else {
                System.out.println("Invalid month number.");
            }
        }
    }
