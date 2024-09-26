import java.io.*;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class Main {
    public static final Path FILE = Paths.get("D:\\Java_projects\\Homework16\\test.txt");
    public static final String BIRTHDAY = "09.01.1998";
    public static final String NAME = "Khrystyna Martynova";

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(FILE);

        int lineCount = 0;
        int commentsCount = 0;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
            if (line.startsWith("//")) commentsCount++;
            lineCount++;
        }
        System.out.println("=".repeat(80));
        System.out.println("Line Count: " + lineCount + "\t Comments Count: " + commentsCount);
        getLongestLine(FILE);


        Path myPath = Paths.get("D:\\Java_projects\\Homework16\\test2.txt");
        if (Files.exists(myPath)) {
            System.out.println("File already exists");
        } else {
            Files.createFile(myPath);
            System.out.println("File created");
        }
        addInfoToFile(myPath,BIRTHDAY,NAME,lineCount,getLongestLine(FILE));
        List<String> list = Files.readAllLines(myPath);
        for (String str : list)
            System.out.println(str);
    }
    public static String getLongestLine(Path file) {
        String longestLine = null;
        try {
            List<String> lines = Files.readAllLines(file);
            longestLine = lines.stream()
                    .max(Comparator.comparingInt(String::length))
                    .orElse("Error");
            System.out.println("The longest line: " + longestLine);
        } catch (IOException e) {
            System.err.println("Error processing the file: " + file);
            e.fillInStackTrace();
        }
        return longestLine;


    }
    public static void addInfoToFile(Path myPath, String birthday, String name, int lineCounts, String longestLine) throws IOException {
        List< String > information = new ArrayList< >();
        information.add(birthday);
        information.add(name);
        information.add(String.valueOf(lineCounts));
        information.add(longestLine);
        System.out.println("Adding information: " + information);
        Files.write(myPath, information, StandardCharsets.UTF_8,
                StandardOpenOption.APPEND);
        System.out.println("Data written successfully!");
        System.out.println("=".repeat(80));
    }
}



