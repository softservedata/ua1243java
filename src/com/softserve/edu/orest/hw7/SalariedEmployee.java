package com.softserve.edu.orest.hw7;

public class SalariedEmployee extends Employee{
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String employeeDetails() {
        return String.format("ID: %s, Name: %s, Social Security: %s", employeeId, name, socialSecurityNumber);
    }
}
