package Module10;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,String> personMap = new HashMap<>();
        personMap.put("Martynov","Oleksandr");
        personMap.put("Koval","Olena");
        personMap.put("Svoren","Petro");
        personMap.put("Martynova","Khrystyna");
        personMap.put("Kovtyn","Olia");
        personMap.put("Mirka","Diana");
        personMap.put("Tyhay","Orest");
        personMap.put("Tsvyk","Roksolana");
        personMap.put("Green","Svitlana");
        personMap.put("Ginda","Orest");

        var register = new Person();
        register.run(personMap);
    }
}
