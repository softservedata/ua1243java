package task02;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class PersonMapOperationsTest {
    @Test
    public void testHasTwoSameNameWithDuplicates() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Ivanov", "Orest");
        personMap.put("Petrov", "Orest");

        assertTrue(PersonMapOperations.hasTwoSameName(personMap));
    }

    @Test
    public void testHasTwoSameNameWithoutDuplicates() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Ivanov", "Orest");
        personMap.put("Petrov", "Andriy");

        assertFalse(PersonMapOperations.hasTwoSameName(personMap));
    }

    @Test
    public void testRemoveByFirstName() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Ivanov", "Orest");
        personMap.put("Petrov", "Andriy");
        personMap.put("Sidorov", "Orest");

        PersonMapOperations.removeByFirstName(personMap, "Orest");

        assertEquals(1, personMap.size());
        assertFalse(personMap.containsValue("Orest"));
    }

    @Test
    public void testRemoveByFirstNameWithNoMatch() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Ivanov", "Orest");
        personMap.put("Petrov", "Andriy");

        PersonMapOperations.removeByFirstName(personMap, "Nonexistent");

        assertEquals(2, personMap.size());
        assertTrue(personMap.containsKey("Ivanov"));
        assertTrue(personMap.containsKey("Petrov"));
    }
}
