package com.softserve.edu.orest.New.hw11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class hw2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "James");
        personMap.put("Popov", "Anna");
        personMap.put("Koval", "Oliver");
        personMap.put("Williams", "Henry");
        personMap.put("Miller", "Elijah");
        personMap.put("Rodríguez", "Orest");
        personMap.put("Martínez", "Anna");
        personMap.put("Johnson", "Emma");
        personMap.put("Ivanov", "James");
        personMap.put("Brown", "Sophia");

        for (var m : personMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        checkDuplicates(personMap);

        removeName(personMap, "Orest");

    }

    private static void checkDuplicates (Map<String, String> personMap) {
        Set<String> allNames = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (var name : personMap.values()) {
            if (!allNames.add(name)) {
                duplicates.add(name);
            }
        }
        if (!duplicates.isEmpty()) {
            System.out.println("Duplicates found " + duplicates);
        } else {
            System.out.println("There are no duplicates");
        }
    }

    private static void removeName (Map<String, String> personMap, String removeName) {
        String nameKey = null;

        for (var entry : personMap.entrySet()) {
            if (entry.getValue().equals(removeName)) {
                nameKey = entry.getKey();
                break;
            }
        }
        personMap.remove(nameKey);
        System.out.println("Person with a name " + removeName + " was removed");
    }
}
