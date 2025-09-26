package com.softserve.edu.orest.New.hw7;

public class SalariedEmployee extends Employee implements Payment{

    private int fixedPaid;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, int fixedPaid, String socialSecurityNumber) {
        super(employeeId);
        this.fixedPaid = fixedPaid;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return fixedPaid;
    }
}
