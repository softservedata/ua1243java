package com.softserve.edu.orest.hw7;

import java.util.Arrays;

public abstract class Main extends Employee{
    public Main(String employeeId, String name) {
        super(employeeId, name);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new SalariedEmployee("23", "Vova", "121212", 8000);
        employees[1] = new ContractEmployee("24", "Masha", "131313", 7, 35);
        employees[2] = new SalariedEmployee("25", "Boris", "141414", 9000);

        Arrays.sort(employees, (e1, e2) -> Double.compare(e2.calculatePay(), e1.calculatePay()));

        for (Employee employee : employees) {
            System.out.printf("ID: %s, Name: %s, Monthly Salary: %.2f\n", employee.employeeId, employee.name, employee.calculatePay());
        }
    }
}

