package com.softserve.edu.orest.New.hw10;

import java.util.*;

public class pt2 {
    public static void main(String[] args) {
        String input = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8";
        String[] fragments = input.split(", ");

        Set<String> set = new LinkedHashSet<>(Arrays.asList(fragments));
        System.out.println(set);
    }
}
