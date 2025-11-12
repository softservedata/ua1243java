package com.softserve.edu.orest.New.hw16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

public class pts {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Users/Kobe/Desktop/pg25344.txt";
        var path = Path.of(fileName);

//        Files.readAllLines(path).subList(0, 10)
//                .forEach(line -> System.out.println(line));

//        try (var lines = Files.lines(path)) {
//            lines
//                    .skip(41)
//                    .limit(10)
//                    .forEach(System.out::println);
//        }

        String[] lines = Files.readAllLines(path).toArray(String[]::new);
        System.out.println(lines.length);

        for (int i = 0; i < 50; i++) {
            System.out.println(i + " : " + lines[i].length());
        }

        Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);

        Arrays.stream(lines)
                .filter(line -> line.contains("var"))
                .forEach(System.out::println);

        //---------------------------------pt2-----------------------------------------

        var splitPattern = Pattern.compile("[^a-zA-Z'-]+");
        String vowels = "aeiouyAEIOUY";

        Arrays.stream(lines)
                .flatMap(line -> splitPattern.splitAsStream(line))
                .filter(line -> !line.isEmpty())
                .filter(word -> vowels.indexOf(word.charAt(0)) != -1)
                .limit(10)
                .forEach(System.out::println);

        var wordIterator = Arrays.stream(lines)
                .flatMap(splitPattern::splitAsStream)
                .filter(line -> !line.isEmpty())
                .iterator();
        String prev = wordIterator.next();
        int count = 20;
        while (wordIterator.hasNext() && count > 0) {
            String word = wordIterator.next();
            if (word.charAt(0) == prev.charAt(prev.length() - 1)) {
                System.out.println(prev + " " + word);
                count--;
            }
            prev = word;
        }
    }
}
