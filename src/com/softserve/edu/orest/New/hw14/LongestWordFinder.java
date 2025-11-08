package com.softserve.edu.orest.New.hw14;

import java.util.Comparator;
import java.util.List;

public class LongestWordFinder {

    public static String find(List<String> words) {

        if (words == null) {
            return null;
        }

        return words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
    }

}
