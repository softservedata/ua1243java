package task01;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Employee> employees = new ArrayList<>();
        employees.add(new SalariedEmployee("E001", "SSN123456", 5000));
        employees.add(new ContractEmployee("E002", "FTID78910",25, 160));
        employees.add(new SalariedEmployee("E003", "SSN654321", 6000));
        employees.add(new ContractEmployee("E004", "FTID11213",30, 120));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return Double.compare(employee1.calculatePay(), employee2.calculatePay());
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
