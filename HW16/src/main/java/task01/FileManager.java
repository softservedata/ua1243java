package task01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.Comparator;
import java.util.List;

public class FileManager {

    public static final Path CAREER_FILE = Paths.get("file1.txt");
    public static final Path INFO_FILE = Paths.get("file2.txt");

    public static final String BIRTHDAY = "16.02.2004";
    public static final String NAME = "Mykyta";

    public static final String TEXT_ABOUT_CAREER = """
            A successful career is built on continuous learning, hard work, and adaptability.
            It's important to set clear goals, maintain a strong network, and always be open to new opportunities.
            Remember to balance professional growth with personal well-being to sustain long-term success.
            The ability to embrace change and acquire new skills is crucial in today’s fast-evolving job market.
            """;

    public static void main(String[] args) {
        inputTextInFile(CAREER_FILE, TEXT_ABOUT_CAREER);

        inputInfoInFile(CAREER_FILE, BIRTHDAY, NAME);
    }

    public static void inputInfoInFile(Path file, String birthday, String name) {
        try {
            List<String> lines = Files.readAllLines(file);

            int numberOfLines = lines.size();
            String longestLine = lines.stream()
                    .max(Comparator.comparingInt(String::length))
                    .orElse("");

            try (BufferedWriter writer = Files.newBufferedWriter(INFO_FILE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
                writer.write("Number of lines in file: " + numberOfLines + "\n");
                writer.write("The longest line: " + longestLine + "\n");
                writer.write("Birthday: " + birthday + "\n");
                writer.write("Name: " + name + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error processing the file: " + file);
            e.printStackTrace();
        }
    }

    public static void inputTextInFile(Path file, String text) {
        try {
            if (!Files.exists(file)) {
                Files.createFile(file);
            }
            Files.writeString(file, text, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + file);
            e.printStackTrace();
        }
    }
}
