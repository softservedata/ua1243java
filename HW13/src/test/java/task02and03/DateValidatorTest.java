package task02and03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class DateValidatorTest {

    @Test
    public void testValidDates() {
        List<String> dates = List.of("31.12.2023", "29.02.2020", "15.07.2021");
        List<String> validDates = DateValidator.validateDates(dates);
        assertEquals(dates, validDates);
    }

    @Test
    public void testInvalidDates() {
        List<String> dates = Arrays.asList("32.04.2022", "33.01.2021", "35.02.2022");
        List<String> validDates = DateValidator.validateDates(dates);
        assertTrue(validDates.isEmpty());
    }

    @Test
    public void testMixedDates() {
        List<String> dates = List.of("31.12.2023", "29.02.2020", "31.05.2022", "15.07.2021", "33.01.2021");
        List<String> validDates = DateValidator.validateDates(dates);
        List<String> expected = Arrays.asList("31.12.2023", "29.02.2020", "31.05.2022", "15.07.2021");
        assertEquals(expected, validDates);
    }

    @Test
    public void testEmptyList() {
        List<String> dates = List.of();
        List<String> validDates = DateValidator.validateDates(dates);
        assertTrue(validDates.isEmpty());
    }

    @Test
    public void testSingleValidDate() {
        List<String> dates = List.of("15.03.2022");
        List<String> validDates = DateValidator.validateDates(dates);
        assertEquals(dates, validDates);
    }

    @Test
    public void testSingleInvalidDate() {
        List<String> dates = List.of("32.04.2022");
        List<String> validDates = DateValidator.validateDates(dates);
        assertTrue(validDates.isEmpty());
    }

    @Test
    public void testLeapYear() {
        assertTrue(DateValidator.isLeap(2020));
        assertTrue(DateValidator.isLeap(2000));
    }

    @Test
    public void testNonLeapYear() {
        assertFalse(DateValidator.isLeap(2021));
        assertFalse(DateValidator.isLeap(1900));
    }

    @Test
    public void testLeapYearsList() {
        List<Integer> years = Arrays.asList(2020, 2021, 2000, 1900, 2004);
        List<Integer> leapYears = DateValidator.leapYears(years);
        List<Integer> expectedLeapYears = Arrays.asList(2020, 2000, 2004);
        assertEquals(expectedLeapYears, leapYears);
    }
}
