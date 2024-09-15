package task02;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeManagerTest {

    @Test
    public void testMostPopularName() {
        Employee emp1 = new Employee("Alice", "Developer", BigDecimal.valueOf(5000), LocalDate.of(2020, 1, 15));
        Employee emp2 = new Employee("Bob", "Manager", BigDecimal.valueOf(6000), LocalDate.of(2019, 3, 22));
        Employee emp3 = new Employee("Alice", "Lead Developer", BigDecimal.valueOf(7000), LocalDate.of(2018, 5, 10));
        Employee emp4 = new Employee("Charlie", "Developer", BigDecimal.valueOf(5500), LocalDate.of(2021, 7, 1));
        Employee emp5 = new Employee("Alice", "Senior Developer", BigDecimal.valueOf(7500), LocalDate.of(2017, 2, 28));
        Employee emp6 = new Employee("Bob", "Senior Manager", BigDecimal.valueOf(6500), LocalDate.of(2016, 8, 14));

        List<Employee> employees = List.of(emp1, emp2, emp3, emp4, emp5, emp6);

        Optional<String> mostPopularName = EmployeeManager.mostPopularName(employees.stream());

        assertTrue(mostPopularName.isPresent());
        assertEquals("Alice", mostPopularName.get());
    }

    @Test
    public void testMostPopularNameWithNoEmployees() {
        Stream<Employee> employees = Stream.empty();

        Optional<String> mostPopularName = EmployeeManager.mostPopularName(employees);

        assertFalse(mostPopularName.isPresent());
    }

    @Test
    public void testMostPopularNameWithOneEmployee() {
        Employee emp1 = new Employee("Alice", "Developer", BigDecimal.valueOf(5000), LocalDate.of(2020, 1, 15));

        Stream<Employee> employees = Stream.of(emp1);

        Optional<String> mostPopularName = EmployeeManager.mostPopularName(employees);

        assertTrue(mostPopularName.isPresent());
        assertEquals("Alice", mostPopularName.get());
    }

    @Test
    public void testMostPopularNameWithEqualFrequency() {
        Employee emp1 = new Employee("Alice", "Developer", BigDecimal.valueOf(5000), LocalDate.of(2020, 1, 15));
        Employee emp2 = new Employee("Bob", "Manager", BigDecimal.valueOf(6000), LocalDate.of(2019, 3, 22));

        List<Employee> employees = List.of(emp1, emp2, emp1, emp2);

        Optional<String> mostPopularName = EmployeeManager.mostPopularName(employees.stream());

        assertTrue(mostPopularName.isPresent());
        assertTrue(mostPopularName.get().equals("Alice") || mostPopularName.get().equals("Bob"));
    }
}
