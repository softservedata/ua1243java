package com.softserve.edu.orest.New.hw13;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.function.*;

public class DateFormatterFnSolution {
// TODO: declare a DateTimeFormatter with pattern "dd-MM-yyyy"
// TODO: declare a Function<LocalDate, String> that formats a date with the formatter
// public static String format(LocalDate date) { return FORMATTER_FN.apply(date); }

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static final Function<LocalDate, String> FORMATTER_FN = date -> date == null ? null : FORMATTER.format(date);

    public static String format(LocalDate date) {
        return FORMATTER_FN.apply(date);
    }
}
