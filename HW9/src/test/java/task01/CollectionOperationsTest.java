package task01;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class CollectionOperationsTest {

    @Test
    void testSwapMinAndMax() {
        List<Integer> testList = new ArrayList<>(Arrays.asList(3, 1, -4, 2, 8, -5, 7, -9, 6));
        CollectionOperations.swapMinAndMax(testList);
        assertEquals(Arrays.asList(3, 1, -4, 2, -9, -5, 7, 8, 6), testList);
    }

    @Test
    void testInsertBeforeNegative() {
        List<Integer> testList = new ArrayList<>(Arrays.asList(3, 1, 2, -5, 7));
        CollectionOperations.insertBeforeNegative(testList);
        assertEquals(Arrays.asList(3, 1, 2, CollectionOperations.RANDOM_NUMBER, -5, 7), testList);
    }

    @Test
    void testInsertZeroBetween() {
        List<Integer> testList = new ArrayList<>(Arrays.asList(3, -1, -4, 2, -8, 5));
        CollectionOperations.insertZeroBetween(testList);
        assertEquals(Arrays.asList(3, 0, -1, -4, 0, 2, 0, -8, 0, 5), testList);
    }

    @Test
    void testSplitDirectAndReverse() {
        List<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<List<Integer>> result = CollectionOperations.splitDirectAndReverse(testList, 3);
        assertEquals(Arrays.asList(1, 2, 3), result.get(0));
        assertEquals(Arrays.asList(6, 5, 4), result.get(1));
    }

    @Test
    void testRemoveLastEven() {
        List<Integer> testList = new ArrayList<>(Arrays.asList(3, 1, 2, 4, 6));
        CollectionOperations.removeLastEven(testList);
        assertEquals(Arrays.asList(3, 1, 2, 4), testList);
    }

    @Test
    void testRemoveAfterFirstMin() {
        List<Integer> testList = new ArrayList<>(Arrays.asList(3, 1, -4, 2, 8, -5, 7));
        CollectionOperations.removeAfterFirstMin(testList);
        assertEquals(Arrays.asList(3, 1, -4, 2, 8, -5), testList);
    }

    @Test
    void testSwapMinAndMaxEmptyList() {
        List<Integer> testList = new ArrayList<>();
        CollectionOperations.swapMinAndMax(testList);
        assertTrue(testList.isEmpty());
    }

    @Test
    void testInsertBeforeNegativeEmptyList() {
        List<Integer> testList = new ArrayList<>();
        CollectionOperations.insertBeforeNegative(testList);
        assertTrue(testList.isEmpty());
    }

    @Test
    void testInsertZeroBetweenEmptyList() {
        List<Integer> testList = new ArrayList<>();
        CollectionOperations.insertZeroBetween(testList);
        assertTrue(testList.isEmpty());
    }

    @Test
    void testSplitDirectAndReverseInvalidParameters() {
        List<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<List<Integer>> result = CollectionOperations.splitDirectAndReverse(testList, 5);
        assertTrue(result.isEmpty());
    }

    @Test
    void testRemoveLastEvenNoEvenElements() {
        List<Integer> testList = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        CollectionOperations.removeLastEven(testList);
        assertEquals(Arrays.asList(1, 3, 5, 7), testList);
    }

    @Test
    void testRemoveAfterFirstMinNoElementToRemove() {
        List<Integer> testList = new ArrayList<>(List.of(1));
        CollectionOperations.removeAfterFirstMin(testList);
        assertEquals(List.of(1), testList);
    }
}
