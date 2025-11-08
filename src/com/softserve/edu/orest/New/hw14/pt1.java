package com.softserve.edu.orest.New.hw14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class pt1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

        long countEnpty = list.stream()
                .filter(l -> l == "")
                .count();
        System.out.println(countEnpty);

        List<String> removeEnpty = list.stream()
                .filter(l -> l != "")
                .toList();
        System.out.println(removeEnpty);

        String listUpper = list.stream()
                .map(l -> l.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(listUpper);
    }
}
