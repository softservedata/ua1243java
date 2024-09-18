package com.softserve.edu.orest.hw6.task2;

public class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, " + "Salary: ₴ %.2f.", name, age, salary);
    }
}