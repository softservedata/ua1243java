import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class pr1_lesson14 {
    public static void main(String[] args) {
    List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

    long emptyCount = list.stream().filter(String::isEmpty).count();
    System.out.println("Number of empty strings: " + emptyCount);

    List<String> filteredList = list.stream()
            .filter(s -> !s.isEmpty())
            .collect(Collectors.toList());
    System.out.println("List after removing empty strings: " + filteredList);

    String result = filteredList.stream()
            .map(String::toUpperCase)
            .collect(Collectors.joining(", "));
    System.out.println("Uppercase joined result: " + result);
}
}
