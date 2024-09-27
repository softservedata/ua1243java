package com.softserve.edu.orest.hw7;

public abstract class Employee implements Payment{
    protected String employeeId;
    protected String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
    public abstract String employeeDetails();
}
