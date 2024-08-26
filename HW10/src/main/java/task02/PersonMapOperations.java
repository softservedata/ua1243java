package task02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PersonMapOperations {

    public static void printPersonMap(Map<String, String> personMap) {
        for(Map.Entry<String, String> entry : personMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static boolean hasTwoSameName(Map<String, String> personMap) {

        Map<String, Integer> personMapCount = new HashMap<>();

        for(String name: personMap.values()){
            personMapCount.put(name, personMapCount.getOrDefault(name, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : personMapCount.entrySet()){
            if(entry.getValue() > 1){
                return true;
            }
        }
        return false;
    }

    public static void removeByFirstName(Map <String, String> personMap, String firstName) {
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();

            if(entry.getValue().equals(firstName)) {
                iterator.remove();
            }
        }

    }

}
