package task04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateManagerTest {

    @Test
    void testPrintDayOfWeek() {
        LocalDate date = LocalDate.of(2024, 1, 1);
        assertEquals("MONDAY", date.getDayOfWeek().toString());
    }

    @Test
    void testPrintDayOfWeekAfterHalfYear() {
        LocalDate date = LocalDate.of(2024, 1, 1);
        LocalDate dateAfterHalfYear = date.plusMonths(6);
        assertEquals("MONDAY", dateAfterHalfYear.getDayOfWeek().toString());
    }

    @Test
    void testPrintDayOfWeekAfterYear() {
        LocalDate date = LocalDate.of(2024, 1, 1);
        LocalDate dateAfterYear = date.plusYears(1);
        assertEquals("WEDNESDAY", dateAfterYear.getDayOfWeek().toString());
    }

    @Test
    void testPrintDayOfWeekInfo() {
        LocalDate date = LocalDate.of(2023, 5, 15);

        assertEquals("MONDAY", date.getDayOfWeek().toString());

        LocalDate dateAfterHalfYear = date.plusMonths(6);
        assertEquals("WEDNESDAY", dateAfterHalfYear.getDayOfWeek().toString());

        LocalDate dateAfterYear = date.plusYears(1);
        assertEquals("WEDNESDAY", dateAfterYear.getDayOfWeek().toString());
    }
}
