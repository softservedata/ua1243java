package com.softserve.edu.orest.New.hw13;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class pt_1_2 {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today.getDayOfWeek());

        TemporalAdjuster firstMonday = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(today.with(firstMonday));
    }
}
