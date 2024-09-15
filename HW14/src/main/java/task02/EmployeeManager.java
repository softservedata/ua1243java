package task02;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeManager {
    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCount = employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return nameCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
