package task02;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Stream;

public class EmployeeManagerApp {
    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(
                new Employee("John", "Developer", BigDecimal.valueOf(5000), LocalDate.of(2020, 1, 15)),
                new Employee("Jane", "Manager", BigDecimal.valueOf(6000), LocalDate.of(2018, 2, 20)),
                new Employee("John", "Developer", BigDecimal.valueOf(5500), LocalDate.of(2019, 3, 10)),
                new Employee("Alice", "Tester", BigDecimal.valueOf(4500), LocalDate.of(2021, 4, 25)),
                new Employee("John", "Developer", BigDecimal.valueOf(5700), LocalDate.of(2022, 5, 5)),
                new Employee("Bob", "Developer", BigDecimal.valueOf(4800), LocalDate.of(2021, 7, 19)),
                new Employee("Jane", "Manager", BigDecimal.valueOf(6200), LocalDate.of(2019, 8, 30)),
                new Employee("Alice", "Tester", BigDecimal.valueOf(4600), LocalDate.of(2021, 9, 12))
        );

        Optional<String> mostPopularName = EmployeeManager.mostPopularName(employees);

        mostPopularName.ifPresent(name -> System.out.println("The most popular name is: " + name));
    }
}

