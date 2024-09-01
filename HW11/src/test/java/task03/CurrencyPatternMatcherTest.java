package task03;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CurrencyPatternMatcherTest {

    @Test
    public void testWithCurrencies() {
        String text = "I have $10.00 and you have $20.50.";
        CurrencyPatternMatcher matcher = new CurrencyPatternMatcher();
        List<String> matches = matcher.currencyMatches(text);

        assertEquals(2, matches.size());
        assertTrue(matches.contains("$10.00"));
        assertTrue(matches.contains("$20.50"));
    }

    @Test
    public void testWithoutCurrencies() {
        String text = "I have no money.";
        CurrencyPatternMatcher matcher = new CurrencyPatternMatcher();
        List<String> matches = matcher.currencyMatches(text);

        assertTrue(matches.isEmpty());
    }

    @Test
    public void testWithInvalidCurrencyFormats() {
        String text = "This text has some invalid $10 and $5.123 formats.";
        CurrencyPatternMatcher matcher = new CurrencyPatternMatcher();
        List<String> matches = matcher.currencyMatches(text);

        assertEquals(0, matches.size());
    }

    @Test
    public void testWithMultipleCurrencies() {
        String text = "Prices are $12.34, $56.78, and $90.12 in different stores.";
        CurrencyPatternMatcher matcher = new CurrencyPatternMatcher();
        List<String> matches = matcher.currencyMatches(text);

        assertEquals(3, matches.size());
        assertTrue(matches.contains("$12.34"));
        assertTrue(matches.contains("$56.78"));
        assertTrue(matches.contains("$90.12"));
    }

    @Test
    public void testWithNoText() {
        String text = "";
        CurrencyPatternMatcher matcher = new CurrencyPatternMatcher();
        List<String> matches = matcher.currencyMatches(text);

        assertTrue(matches.isEmpty());
    }

    @Test
    public void testWithSpacesAndNewlines() {
        String text = "The costs are: \n$123.45 \nand \n $67.89.";
        CurrencyPatternMatcher matcher = new CurrencyPatternMatcher();
        List<String> matches = matcher.currencyMatches(text);

        assertEquals(2, matches.size());
        assertTrue(matches.contains("$123.45"));
        assertTrue(matches.contains("$67.89"));
    }
}
