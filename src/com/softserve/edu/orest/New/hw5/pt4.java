package com.softserve.edu.orest.New.hw5;

import java.util.Scanner;

public class pt4 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Alice", 1, 10000),
                new Employee("Bob", 3, 9000),
                new Employee("Jack", 2, 9500),
                new Employee("Mark", 2, 11000),
                new Employee("John", 3, 12000),
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter department number ");
        int i = scanner.nextInt();
        boolean found = false;
        for (var emp : employees) {
            if (emp.getDepartmentNumber() == i) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no employees from " + i + " department");
        }
        System.out.println("=".repeat(40));

        sort(employees);
        for (var emp : employees)
        System.out.println(emp);
    }

    static void sort(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    var tmp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = tmp;
                }
            }
        }
    }
}

class Employee {
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }
}