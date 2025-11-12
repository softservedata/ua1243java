package com.softserve.edu.orest.New.hw16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.io.PrintWriter;

public class hw {
    public static void main(String[] args) {

        String name1 = "file1.txt";
        String name2 = "file2.txt";
        Path path1 = Paths.get("file1.txt");
        Path path2 = Paths.get("file2.txt");

        List<String> careerText = Arrays.asList(
                " text about your career",
                " text about your career text about your career",
                " text about your career text about your career text about your career"
        );

        try {
            Files.write(path1, careerText);
            System.out.println("1. Created and wrote content to 'file1.txt'.");

            List<String> lines = Files.readAllLines(path1);
            String[] linesArray = lines.toArray(new String[0]);

            System.out.println("2. Read content into an array (" + linesArray.length + " lines).");

            int numberOfLines = lines.size();
            String longestLine = "";

            if (!lines.isEmpty()) {
                longestLine = Collections.max(lines, Comparator.comparingInt(String::length));
            }
            System.out.println("Longest line found: '" + longestLine + "'");


            try (PrintWriter writer = new PrintWriter(path2.toFile())) {

                writer.println("1) Number of lines: " + numberOfLines);

                writer.println("2) The longest line (Length: " + longestLine.length() + "):");
                writer.println("   " + longestLine);

                writer.println("name - Orest");
                writer.println("birthday - 25.04.1993");

                System.out.println("3. Wrote results to 'file2.txt'.");

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
