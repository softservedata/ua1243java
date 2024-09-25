import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employe {
    String name;

    Employe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class hw2_lesson14 {
    public static void main(String[] args) {
        Stream<Employe> employeeStream = Stream.of(
                new Employe("Bob"),
                new Employe("Din"),
                new Employe("Sam"),
                new Employe("Sam")
        );

        Optional<String> mostPopularName = findMostPopularName(employeeStream);
        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }

    public static Optional<String> findMostPopularName(Stream<Employe> employeeStream) {
        return employeeStream
                .map(Employe::getName)
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
