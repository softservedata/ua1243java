package com.softserve.edu.orest.hw10;

import java.util.HashSet;
import java.util.Set;

public class Operations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> combinedSet = new HashSet<>(set1);
        combinedSet.addAll(set2);
        return combinedSet;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> combinedSet = new HashSet<>(set1);
        combinedSet.retainAll(set2);
        return combinedSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(4);

        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Обєднання: " + unionSet);

        Set<Integer> intersectionSet = intersect(set1, set2);
        System.out.println("Перетин: " + intersectionSet);
    }
}


