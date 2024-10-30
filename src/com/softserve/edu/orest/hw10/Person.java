package com.softserve.edu.orest.hw10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Person {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        // це рандомно згенеровані імена гуглом

        personMap.put("Яворовська", "Нігослава");
        personMap.put("Копанюк", "Орест");
        personMap.put("Ільяшенко", "Ростислав");
        personMap.put("Індик", "Андрій");
        personMap.put("Духота", "Дана");
        personMap.put("Цись", "Силата");
        personMap.put("Демидчук", "Хранимир");
        personMap.put("Ляшко", "Єгор");
        personMap.put("Іллєнко", "Нестор");
        personMap.put("Уляницький", "Зоремир");

        System.out.println("PersonMap: " + personMap);



        Set<String> uniqueNames = new HashSet<>();
        boolean duplicatedFirstName = false;

        for (String firstName : personMap.values()) {
            if (!uniqueNames.add(firstName)) {
                duplicatedFirstName = true;
                break;
            }
        }
        System.out.println("\nЧи є дуплікати імен? " + (duplicatedFirstName ? "Так" : "Ні"));



        String nameToRemove = "Орест";
        String surnameToRemove = null;

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals(nameToRemove)) {
                surnameToRemove = entry.getKey();
                break;
            }
        }

        if (surnameToRemove != null) {
            personMap.remove(surnameToRemove);
        }

        System.out.println("PersonMap після видалення запису Орест: " + personMap);
    }
}
