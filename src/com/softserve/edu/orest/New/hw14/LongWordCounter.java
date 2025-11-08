package com.softserve.edu.orest.New.hw14;

import java.util.List;

public class LongWordCounter {
    public static long countLongWords(List<String> words) {

        if (words == null) {
            return 0;
        }

        return words.stream()
                .filter(word -> word.length() > 5)
                .count();
    }
}
