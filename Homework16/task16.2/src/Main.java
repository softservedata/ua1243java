import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static final Path FILE = Paths.get("D:\\Java_projects\\Homework16\\task5.1\\src\\com.softserve\\finder\\Finder.java");
    private static final Path NEW_FILE = Paths.get("D:\\Java_projects\\Homework16\\NewCode\\src\\Main.java");

    public static void main(String[] args) {
        changeWord(FILE);
    }
    public static void changeWord(Path file)  {
        try{
        List<String> list = Files.readAllLines(file);

        List<String> changeWordInLine = list.stream()
                .map(line -> line.replaceAll("\\bpublic\\b", "private"))
                .toList();
        Files.write(NEW_FILE, changeWordInLine, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }


    }
}