import java.util.HashMap;
import java.util.Map;

public class hw2_lesson10 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Shevchenko", "Taras");
        personMap.put("Franko", "Ivan");
        personMap.put("Kobzar", "Taras");
        personMap.put("Skovoroda", "Hryhoriy");
        personMap.put("Lys", "Orest");
        personMap.put("Symonenko", "Vasyl");
        personMap.put("Stus", "Vasyl");
        personMap.put("Sahaydachny", "Petro");
        personMap.put("Kotsiubynsky", "Mykhailo");
        personMap.put("Drahomanov", "Mykhailo");

        System.out.println("Initial Person Map: " + personMap);

        Map<String, Integer> firstNameCount = new HashMap<>();
        for (String firstName : personMap.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }

        boolean hasDuplicateFirstName = false;
        for (Map.Entry<String, Integer> entry : firstNameCount.entrySet()) {
            if (entry.getValue() > 1) {
                hasDuplicateFirstName = true;
                System.out.println("There are at least two people with the first name: " + entry.getKey());
            }
        }
        if (!hasDuplicateFirstName) {
            System.out.println("There are no duplicate first names.");
        }

        String firstNameToRemove = "Orest";
        String keyToRemove = null;
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals(firstNameToRemove)) {
                keyToRemove = entry.getKey();
                break;
            }
        }

        if (keyToRemove != null) {
            personMap.remove(keyToRemove);
            System.out.println("Removed person with first name: " + firstNameToRemove);
        } else {
            System.out.println("Person with first name '" + firstNameToRemove + "' not found.");
        }

        System.out.println("Updated Person Map: " + personMap);
    }
}
