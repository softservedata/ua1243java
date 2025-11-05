package com.softserve.edu.orest.New.hw13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class hw2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM.dd.yyyy");
        LocalDate date1 = LocalDate.parse("03.11.2025", dtf);
        System.out.println(date1);
    }
}
