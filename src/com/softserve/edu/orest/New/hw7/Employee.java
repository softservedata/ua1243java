package com.softserve.edu.orest.New.hw7;

import org.jetbrains.annotations.NotNull;

abstract class Employee implements Payment {
    private String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
