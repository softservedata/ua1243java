package com.softserve.edu.orest.hw6.task2;

public class Developer extends Employee {

    protected String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }
    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, " + "Salary: ₴ %.2f. %s", name, age, salary, position);
    }
}