package com.softserve.edu.orest.New.hw13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pt3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("bob", "josh", "megan", "Alice"));
//        names.sort((o1, o2) -> o1.compareTo(o2));
        names.sort(String::compareToIgnoreCase);
        System.out.println(names);
    }
}
