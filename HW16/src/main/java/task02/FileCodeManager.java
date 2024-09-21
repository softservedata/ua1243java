package task02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileCodeManager {
    private static final Path JAVA_CODE = Paths.get("src/main/java/task01/FileManager.java");
    private static final Path NEW_CODE_FILE = Paths.get("ChangeCode.java");

    public static void main(String[] args) {
        changeAccessModifier(JAVA_CODE);
    }

    public static void changeAccessModifier(Path path) {
        try {
            List<String> linesCode = Files.readAllLines(path);
            List<String> changeLinesCode = linesCode.stream()
                    .map(line -> line.replaceAll("\\bpublic\\b", "private"))
                    .toList();

            Files.write(NEW_CODE_FILE, changeLinesCode, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

