package com.softserve.edu.orest.New.hw11;

import java.util.HashSet;
import java.util.Set;
import java.util.SimpleTimeZone;

public class hw1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("one");
        set1.add("two");
        set1.add("three");
        set1.add("four");
        set1.add("nine");

        Set<String> set2 = new HashSet<>();
        set2.add("five");
        set2.add("six");
        set2.add("seven");
        set2.add("eight");
        set2.add("nine");

        System.out.println(set1);
        System.out.println(set2);

        Set<String> set3 = union(set1, set2);
        System.out.println(set3);

        Set<String> set4 = intersect(set1, set2);
        System.out.println(set4);

    }

    public static Set<String> union(Set set1, Set set2) {
        Set<String> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        return set3;
    }
    public static Set<String>  intersect(Set set1, Set set2) {
        Set<String> set4 = new HashSet<>(set1);
        set4.retainAll(set2);
        return set4;
    }

}
