import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeManagementSystem {

    static Optional<String> mostPopularName(Stream <Employee> employees){
         Map<String, Long> nameEmployees = employees
                 .collect(Collectors.groupingBy
                         (Employee::getName, Collectors.counting()));
         System.out.println("Count of name employees present in the organization" + nameEmployees);

         if(nameEmployees.isEmpty()){
            return Optional.empty();
        }
         return nameEmployees.entrySet().stream().
                 max(Map.Entry.comparingByValue()).
                 map(Map.Entry::getKey);

    }
}
