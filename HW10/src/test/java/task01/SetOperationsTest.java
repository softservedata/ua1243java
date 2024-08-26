package task01;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetOperationsTest {

    @Test
    public void testUnion() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedUnion = new HashSet<>();
        expectedUnion.add(1);
        expectedUnion.add(2);
        expectedUnion.add(3);
        expectedUnion.add(4);
        expectedUnion.add(5);

        Set<Integer> result = SetOperations.union(set1, set2);
        assertEquals(expectedUnion, result, "Union of set1 and set2 should contain all elements from both sets without duplicates.");
    }

    @Test
    public void testIntersect() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> expectedIntersection = new HashSet<>();
        expectedIntersection.add(2);
        expectedIntersection.add(3);

        Set<Integer> result = SetOperations.intersect(set1, set2);
        assertEquals(expectedIntersection, result, "Intersection of set1 and set2 should contain only common elements.");
    }

    @Test
    public void testUnionWithEmptySet() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();

        Set<Integer> expectedUnion = new HashSet<>(set1);

        Set<Integer> result = SetOperations.union(set1, set2);
        assertEquals(expectedUnion, result, "Union with an empty set should return the non-empty set unchanged.");
    }

    @Test
    public void testIntersectWithEmptySet() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();

        Set<Integer> expectedIntersection = new HashSet<>();

        Set<Integer> result = SetOperations.intersect(set1, set2);
        assertEquals(expectedIntersection, result, "Intersection with an empty set should return an empty set.");
    }

    @Test
    public void testUnionWithIdenticalSets() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>(set1);

        Set<Integer> expectedUnion = new HashSet<>(set1);

        Set<Integer> result = SetOperations.union(set1, set2);
        assertEquals(expectedUnion, result, "Union of two identical sets should return a set with the same elements.");
    }

    @Test
    public void testIntersectWithIdenticalSets() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>(set1);

        Set<Integer> expectedIntersection = new HashSet<>(set1);

        Set<Integer> result = SetOperations.intersect(set1, set2);
        assertEquals(expectedIntersection, result, "Intersection of two identical sets should return a set with the same elements.");
    }
}
