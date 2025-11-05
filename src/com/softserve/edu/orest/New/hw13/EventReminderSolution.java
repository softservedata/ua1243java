package com.softserve.edu.orest.New.hw13;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.function.*;

public class EventReminderSolution {
// TODO: declare a Consumer<LocalDate> that prints how many days are left from today
// Hint: Period p = Period.between(LocalDate.now(), targetDate)
// public static void remind(LocalDate date) { REMINDER.accept(date); }

    private static final LocalDate SIMULATED_TODAY = LocalDate.of(2025, 11, 5);

    public static final Consumer<LocalDate> REMINDER = targetDate -> {
        if (targetDate == null) {
            System.out.println("Date is null");
            return;
        }

        long daysLeft = ChronoUnit.DAYS.between(SIMULATED_TODAY, targetDate);

        if (daysLeft > 0) {
            System.out.println(daysLeft + " days left until the event!");
        } else if (daysLeft == 0) {
            System.out.println("0 days left until the event!");
        } else {
            System.out.println("The event passed " + (-daysLeft) + " days ago.");
        }
    };

    public static void remind(LocalDate date) {
        REMINDER.accept(date);
    }
}
