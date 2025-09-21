package com.softserve.edu.orest.New.hw4;

import java.util.Scanner;

public class DayOfTheWeek {
    enum Days {
        MONDAY("Monday", "Понеділок"),
        TUESDAY("Tuesday", "Вівторок"),
        WEDNESDAY("Wednesday", "Середа"),
        THURSDAY("Thursday", "Четвер"),
        FRIDAY("Friday", "Пятниця"),
        SATURDAY("Saturday", "Субота"),
        SUNDAY("Sunday", "Неділя");

        public final String eng;
        public final String ukr;

        Days(String eng, String ukr) {
            this.eng = eng;
            this.ukr = ukr;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week:");
        int dayNumber = scanner.nextInt();

        Days day = DayOfTheWeek.getByNumber(dayNumber);
        System.out.println("This number corresponds to " + day.eng);
        System.out.println("Цей номер відповідає " + day.ukr);
    }

    public static Days getByNumber(int number) {
        return switch (number) {
            case 1 -> Days.MONDAY;
            case 2 -> Days.TUESDAY;
            case 3 -> Days.WEDNESDAY;
            case 4 -> Days.THURSDAY;
            case 5 -> Days.FRIDAY;
            case 6 -> Days.SATURDAY;
            case 7 -> Days.SUNDAY;
            default -> throw new IllegalArgumentException("Invalid day number " + number);

        };
    }
}

