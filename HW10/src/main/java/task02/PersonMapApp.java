package task02;

import java.util.HashMap;
import java.util.Map;

public class PersonMapApp {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Smith", "John");
        personMap.put("Johnson", "Emily");
        personMap.put("Williams", "John");
        personMap.put("Jones", "Michael");
        personMap.put("Brown", "Sarah");
        personMap.put("Davis", "Jessica");
        personMap.put("Miller", "Orest");
        personMap.put("Wilson", "Daniel");
        personMap.put("Moore", "Anna");
        personMap.put("Taylor", "Michael");

        System.out.println("People: ");
        PersonMapOperations.printPersonMap(personMap);

        boolean hasDuplicates = PersonMapOperations.hasTwoSameName(personMap);
        if (hasDuplicates) {
            System.out.println("\nThere are at least two persons with the same first name.");
        } else {
            System.out.println("\nNo duplicate first names found.");
        }

        PersonMapOperations.removeByFirstName(personMap, "Orest");

        System.out.println("\nMap after removing 'Orest':");
        PersonMapOperations.printPersonMap(personMap);

    }
}
