package com.softserve.edu.orest.New.hw10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMerger {
    // TODO: Implement method to merge and sort persons by age
    public static List<Person> mergeAndSortPersons(List<Person> list1, List<Person> list2) {
        // Method should merge list1 and list2, remove duplicates, and sort by age in ascending order
        List<Person> safeList1 = (list1 == null) ? Collections.emptyList() : list1;
        List<Person> safeList2 = (list2 == null) ? Collections.emptyList() : list2;

        List<Person> dupRemoved = new ArrayList<>();

        for (Person person : safeList1) {
            if (!dupRemoved.contains(person)) {
                dupRemoved.add(person);
            }
        }
        for (Person person : safeList2) {
            if (!dupRemoved.contains(person)) {
                dupRemoved.add(person);
            }
        }
        dupRemoved.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        return dupRemoved;
    }

    // TODO: Implement method to filter persons by a minimum age
    public static List<Person> filterByMinimumAge(List<Person> persons, int minAge) {
        // Method should return a list of persons with age greater than or equal to minAge
        if (persons == null) {
            return new ArrayList<>();
        }

        List<Person> filtered = new ArrayList<>();
        for (var person : persons) {
            if (person.getAge() >= minAge) {
                filtered.add(person);
            }
        }
        return filtered;
    }

    // TODO: Implement method to calculate the average age of persons
    public static double calculateAverageAge(List<Person> persons) {
        // Method should calculate and return the average age of persons in the list
        if (persons == null || persons.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (Person person : persons) {
            sum += person.getAge();
        }

        double avarageAge = sum / persons.size();

        return avarageAge;
    }
}
