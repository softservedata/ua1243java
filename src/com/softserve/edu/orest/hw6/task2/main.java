package com.softserve.edu.orest.hw6.task2;

public class main {
    public static void main(String[] args) {
        Employee employee = new Employee("Taras", 32,32735.35);
        Developer developer = new Developer("Vova", 18, 3456, "Avarage Java developer");
        System.out.println(employee.report());
        System.out.println(developer.report());
    }

}
