package com.softserve.edu.orest.New.hw7;

import java.util.Comparator;

public class EmployeesByPay implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.calculatePay(), o2.calculatePay());
    }
}
