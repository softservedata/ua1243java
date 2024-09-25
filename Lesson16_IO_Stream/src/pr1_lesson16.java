import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class pr1_lesson16 {
    public static void main(String[] args) {
        //Потрібно вставити шлях до вашого файлу
        String filePath = "mytext.txt";
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            for (String line : lines) {
                writer.write("Line: \"" + line + "\" has " + line.length() + " symbols.\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String longestLine = "";
        String shortestLine = lines.size() > 0 ? lines.get(0) : "";

        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
            if (line.length() < shortestLine.length()) {
                shortestLine = line;
            }
        }

        System.out.println("Longest line: \"" + longestLine + "\"");
        System.out.println("Shortest line: \"" + shortestLine + "\"");

        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.write("\nLines containing the word 'var':\n");
            for (String line : lines) {
                if (line.contains("var")) {
                    writer.write(line + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
