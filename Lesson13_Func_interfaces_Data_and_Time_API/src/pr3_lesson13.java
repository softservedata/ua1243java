import java.util.ArrayList;
import java.util.List;

public class pr3_lesson13 {
    public static void sortStrings(List<String> stringList) {
        stringList.sort((s1, s2) -> s1.compareTo(s2));
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("Potato");
        stringList.add("Oleg");

        System.out.println("Before sorting: " + stringList);

        sortStrings(stringList);

        System.out.println("After sorting: " + stringList);
    }
}
