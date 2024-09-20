import java.util.Scanner;

import static java.lang.System.in;

public class pr2_lesson4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.print("Enter the number of the day of the week (1 for Monday, 7 for Sunday): ");
        int dayNumber = scan.nextInt();

        String dayEnglish = "";
        String dayUkrainian = "";

        switch (dayNumber) {
            case 1:
                dayEnglish = "Monday";
                dayUkrainian = "Понеділок";
                break;
            case 2:
                dayEnglish = "Tuesday";
                dayUkrainian = "Вівторок";
                break;
            case 3:
                dayEnglish = "Wednesday";
                dayUkrainian = "Середа";
                break;
            case 4:
                dayEnglish = "Thursday";
                dayUkrainian = "Четвер";
                break;
            case 5:
                dayEnglish = "Friday";
                dayUkrainian = "Пʼятниця";
                break;
            case 6:
                dayEnglish = "Saturday";
                dayUkrainian = "Субота";
                break;
            case 7:
                dayEnglish = "Sunday";
                dayUkrainian = "Неділя";
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
                return;
        }

        System.out.println("Day of the week in English: " + dayEnglish);
        System.out.println("Day of the week in Ukrainian: " + dayUkrainian);
    }
}
