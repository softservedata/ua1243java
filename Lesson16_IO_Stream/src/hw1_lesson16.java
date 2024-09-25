import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class hw1_lesson16 {
    public static void main(String[] args) {
        String file1Path = "hw1.txt";
        String file2Path = "hw11.txt";
        String[] lines = new String[100]; // Assuming a maximum of 100 lines
        int lineCount = 0;
        String longestLine = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(file1Path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines[lineCount] = line;
                lineCount++;
                if (line.length() > longestLine.length()) {
                    longestLine = line;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String name = "Denys";
        String birthday = "September 15";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file2Path))) {
            writer.write("Number of lines in file1.txt: " + lineCount);
            writer.newLine();
            writer.write("Longest line in file1.txt: " + longestLine);
            writer.newLine();
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Birthday: " + birthday);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
