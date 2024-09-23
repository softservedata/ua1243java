package academy.softserve.Homework7.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new ContractEmployee("KE001", 27.7, 168, 23);
        Employee employee2 = new SalariedEmployee("SE001", 4300, "44");
        Employee employee3 = new ContractEmployee("CE002", 35, 168, 44);
        Employee employee4 = new SalariedEmployee("SE011", 8000, "32");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        for (Employee numbs : employees) {
            System.out.println(numbs);
        }
        Collections.sort(employees);
        System.out.println("\nSorted by monthly pay");
        for (Employee numbs : employees) {
            System.out.println(numbs);
        }
    }
}