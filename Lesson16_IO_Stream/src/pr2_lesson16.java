import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class pr2_lesson16 {
    public static void main(String[] args) {
        //Потрібно вставити шлях до вашого файлу
        String filePath = "input.txt";
        List<String> words = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("\\W+");
                for (String word : lineWords) {
                    if (!word.isEmpty()) {
                        words.add(word.toLowerCase());
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("Words starting with a vowel:");
        for (String word : words) {
            if (isVowel(word.charAt(0))) {
                System.out.println(word);
            }
        }

        System.out.println("\nWords where the last letter of one word matches the first letter of the next word:");
        for (int i = 0; i < words.size() - 1; i++) {
            if (words.get(i).charAt(words.get(i).length() - 1) == words.get(i + 1).charAt(0)) {
                System.out.println(words.get(i) + " -> " + words.get(i + 1));
            }
        }
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(Character.toLowerCase(ch)) != -1;
    }
}
