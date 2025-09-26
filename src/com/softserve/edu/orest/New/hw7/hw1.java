package com.softserve.edu.orest.New.hw7;

import java.util.Arrays;
import java.util.Comparator;

public class hw1 {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Ivan", 27000, "nsd5"),
                new ContractEmployee("Tolik", 11, 30, "dfk5"),
                new SalariedEmployee("Vova", 30000, "nsd6"),
                new ContractEmployee("Misha", 9, 32, "dfk6")
        };

        Arrays.sort(employees, new EmployeesByPay());

        for (Employee employee : employees) {
            System.out.println("Employee " + employee.getEmployeeId() + " earns " + employee.calculatePay());
        }
    }
}
