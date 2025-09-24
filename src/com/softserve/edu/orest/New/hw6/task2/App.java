package com.softserve.edu.orest.New.hw6.task2;

public class App {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Taras", 32, 3232.32),
                new Developer("Ivan", 30, 3434.34, "Java_dev")
        };

        for (Employee employee : employees){
            System.out.println(employee.report());
        }

    }
}
