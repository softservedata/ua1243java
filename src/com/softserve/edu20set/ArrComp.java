package com.softserve.edu20set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrComp {

    // O(n)
    public static void main(String[] args) {
        Integer[] a1 = {1, 3, 2, 4, 3, 1, 2, 4, 2, 1, 3};
        Integer[] a2 = {4, 4, 3, 2, 1, 3, 2, 1};
        //
        Set<Integer> s1 = new HashSet<>(Arrays.asList(a1));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(a2));
        //
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
    }
}
