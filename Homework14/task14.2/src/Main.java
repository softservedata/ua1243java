import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(
                new Employee(1,"Oleksandr"),
                new Employee(2,"Roman"),
                new Employee(3,"Khrystyna"),
                new Employee(4,"Rystam"),
                new Employee(5,"Oleksandr"),
                new Employee(6,"Oleksandr"),
                new Employee(7,"Oleg"),
                new Employee(8,"Olga"),
                new Employee(9,"Olena"),
                new Employee(10,"Oleksandr"));

        Optional<String> mostPopularName = EmployeeManagementSystem.mostPopularName(employees);
        mostPopularName.ifPresent(name -> System.out.println("The most popular name is: "+name));

    }
}