package com.softserve.edu.orest.New.hw13;

import java.time.LocalDate;

public class hw3 {
    public static int year = LocalDate.now().getYear();
    public static boolean checkLeap(int year) {
        return (year%4 == 0) && (year%100 != 0 || year%400 == 0);
    }

    public static void main(String[] args) {
        System.out.println(checkLeap(2025));
        System.out.println(checkLeap(2024));
    }
}
