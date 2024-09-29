package HW10;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Person {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Anastasiia", "Datsko");
        personMap.put("Orest", "Krut");
        personMap.put("Elina", "Emily");
        personMap.put("Taylor", "Swift");
        personMap.put("Andriy", "Danylo");
        personMap.put("Olha", "Sofia");
        personMap.put("Nastya", "Emma");
        personMap.put("Oksana", "Orest");
        personMap.put("Olena", "Madonna");
        personMap.put("Marta", "Anna");

        System.out.println("Initial Map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }

        System.out.println("\nChecking if there are at least two people with the same first name...");
        Map<String, Integer> nameCount = new HashMap<>();
        for (String firstName : personMap.values()) {
            nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1);
        }

        boolean hasDuplicates = false;
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("There are multiple people with the first name: " + entry.getKey());
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate first names found.");
        }

        System.out.println("\nRemoving the person with the first name ");
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals("Orest")) {
                iterator.remove();
            }
        }

        System.out.println("\nMap after removing persons with first name Orest:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }
    }
}
