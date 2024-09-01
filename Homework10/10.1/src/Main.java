import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("x");
        s1.add("y");
        s1.add("z");

        Set<String> s2 = new HashSet<>();
        s2.add("x");
        s2.add("p");
        s2.add("q");

        System.out.println("Set s1: " + s1);
        System.out.println("Set s2: " + s2);
        System.out.println("=".repeat(60));
        System.out.println("Intersection set is: " + SetFunctionality.intersect(s1,s2));
        System.out.println("=".repeat(60));

        System.out.println("Set s1: " + s1);
        System.out.println("Set s2: " + s2);
        System.out.println("=".repeat(60));
        System.out.println("Union set is: " + SetFunctionality.union(s1,s2));
    }
}
