package task01.test;

import task01.second.NumberProcessor;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberProcessorTest {

    @Test
    public void testGetSumOfFirstFive() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expectedSum = 15; // 1 + 2 + 3 + 4 + 5
        assertEquals(expectedSum, NumberProcessor.getSumOfFirstFive(numbers));
    }

    @Test
    public void testGetProductOfLastFive() {
        int[] numbers = {1, 2, 3, 4, 5, 2, 3, 4, 5, 6};
        int expectedProduct = 720; // 2 * 3 * 4 * 5 * 6
        assertEquals(expectedProduct, NumberProcessor.getProductOfLastFive(numbers));
    }

    @Test
    public void testAreFirstFivePositive() {
        int[] numbers = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        assertTrue(NumberProcessor.areFirstFivePositive(numbers));
    }

    @Test
    public void testAreFirstFivePositiveOneNonPositive() {
        int[] numbers = {1, 2, -3, 4, 5, -1, -2, -3, -4, -5};
        assertFalse(NumberProcessor.areFirstFivePositive(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSumOfFirstFiveArrayTooShort() {
        int[] numbers = {1, 2, 3, 4};
        NumberProcessor.getSumOfFirstFive(numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetProductOfLastFiveArrayTooShort() {
        int[] numbers = {1, 2, 3, 4};
        NumberProcessor.getProductOfLastFive(numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAreFirstFivePositiveArrayTooShort() {
        int[] numbers = {1, 2, 3, 4};
        NumberProcessor.areFirstFivePositive(numbers);
    }
}
