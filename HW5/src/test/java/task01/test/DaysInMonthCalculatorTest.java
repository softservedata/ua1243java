package task01.test;

import org.junit.jupiter.api.Assertions;
import task01.first.DaysInMonthCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DaysInMonthCalculatorTest {

    @Test
    public void testDaysInMonthNonLeapYear() {
        Assertions.assertEquals(31, DaysInMonthCalculator.getDaysInMonth(1, 2023));
        assertEquals(28, DaysInMonthCalculator.getDaysInMonth(2, 2023));
        assertEquals(31, DaysInMonthCalculator.getDaysInMonth(3, 2023));
        assertEquals(30, DaysInMonthCalculator.getDaysInMonth(4, 2023));
        assertEquals(31, DaysInMonthCalculator.getDaysInMonth(5, 2023));
        assertEquals(30, DaysInMonthCalculator.getDaysInMonth(6, 2023));
        assertEquals(31, DaysInMonthCalculator.getDaysInMonth(7, 2023));
        assertEquals(31, DaysInMonthCalculator.getDaysInMonth(8, 2023));
        assertEquals(30, DaysInMonthCalculator.getDaysInMonth(9, 2023));
        assertEquals(31, DaysInMonthCalculator.getDaysInMonth(10, 2023));
        assertEquals(30, DaysInMonthCalculator.getDaysInMonth(11, 2023));
        assertEquals(31, DaysInMonthCalculator.getDaysInMonth(12, 2023));
    }

    @Test
    public void testDaysInMonthLeapYear() {
        assertEquals(31, DaysInMonthCalculator.getDaysInMonth(1, 2024));
        assertEquals(29, DaysInMonthCalculator.getDaysInMonth(2, 2024));
        assertEquals(31, DaysInMonthCalculator.getDaysInMonth(3, 2024));
        assertEquals(30, DaysInMonthCalculator.getDaysInMonth(4, 2024));
        assertEquals(31, DaysInMonthCalculator.getDaysInMonth(5, 2024));
        assertEquals(30, DaysInMonthCalculator.getDaysInMonth(6, 2024));
        assertEquals(31, DaysInMonthCalculator.getDaysInMonth(7, 2024));
        assertEquals(31, DaysInMonthCalculator.getDaysInMonth(8, 2024));
        assertEquals(30, DaysInMonthCalculator.getDaysInMonth(9, 2024));
        assertEquals(31, DaysInMonthCalculator.getDaysInMonth(10, 2024));
        assertEquals(30, DaysInMonthCalculator.getDaysInMonth(11, 2024));
        assertEquals(31, DaysInMonthCalculator.getDaysInMonth(12, 2024));
    }

    @Test
    public void testDaysInMonthInvalidMonth() {
        assertEquals(-1, DaysInMonthCalculator.getDaysInMonth(0, 2023));
        assertEquals(-1, DaysInMonthCalculator.getDaysInMonth(13, 2023));
    }

}

