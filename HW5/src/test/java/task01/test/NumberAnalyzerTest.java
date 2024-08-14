package task01.test;

import org.junit.Assert;
import task01.third.NumberAnalyzer;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberAnalyzerTest {

    @Test
    public void testGetPositionSecondPositiveFound() {
        int[] numbers = {-3, 7, -1, 4, 0, 2};
        Assert.assertEquals(3, NumberAnalyzer.getPositionSecondPositive(numbers));
    }

    @Test
    public void testGetPositionSecondPositiveNotFound() {
        int[] numbers = {-3, -7, -1, -4, 0, 2};
        assertEquals(-1, NumberAnalyzer.getPositionSecondPositive(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPositionSecondPositiveEmptyArray() {
        int[] numbers = {};
        NumberAnalyzer.getPositionSecondPositive(numbers);
    }

    @Test
    public void testGetMinValueFound() {
        int[] numbers = {3, 7, 1, 4, 0, 2};
        assertEquals(0, NumberAnalyzer.getMinValue(numbers));
    }

    @Test
    public void testGetMinValueSingleElement() {
        int[] numbers = {42};
        assertEquals(42, NumberAnalyzer.getMinValue(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetMinValueEmptyArray() {
        int[] numbers = {};
        NumberAnalyzer.getMinValue(numbers);
    }

    @Test
    public void testGetMinValuePositionFound() {
        int[] numbers = {3, 7, 1, 4, 0, 2};
        assertEquals(4, NumberAnalyzer.getMinValuePosition(numbers));
    }

    @Test
    public void testGetMinValuePositionSingleElement() {
        int[] numbers = {42};
        assertEquals(0, NumberAnalyzer.getMinValuePosition(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetMinValuePositionEmptyArray() {
        int[] numbers = {};
        NumberAnalyzer.getMinValuePosition(numbers);
    }

    @Test
    public void testGetProductEvenNumbersHasEvenNumbers() {
        int[] numbers = {3, 4, 6, 8, 2, 5};
        assertEquals(384, NumberAnalyzer.getProductEvenNumbers(numbers));
    }

    @Test
    public void testGetProductEvenNumbersNoEvenNumbers() {
        int[] numbers = {3, 7, 1, 5};
        assertEquals(-1, NumberAnalyzer.getProductEvenNumbers(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetProductEvenNumbersEmptyArray() {
        int[] numbers = {};
        NumberAnalyzer.getProductEvenNumbers(numbers);
    }
}
