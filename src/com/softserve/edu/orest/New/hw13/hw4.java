package com.softserve.edu.orest.New.hw13;

import java.time.LocalDate;

public class hw4 {
    public static LocalDate birthday = LocalDate.of(1993, 4,25);

    public static void print(LocalDate birthday) {
        System.out.println("Day of the week " + birthday.getDayOfWeek());
        System.out.println("After 6 months " + birthday.plusMonths(6).getDayOfWeek());
        System.out.println("after 1 year " + birthday.plusYears(1).getDayOfWeek());
    }

    public static void main(String[] args) {
        print(birthday);
    }
}
