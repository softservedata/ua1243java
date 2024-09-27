package com.softserve.edu.orest.hw7;

public class ContractEmployee extends Employee{
    private String federalTaxIdmember;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String name, String federalTaxIdmember, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String employeeDetails() {
        return String.format("ID: %s, Name: %s, Federal Tax ID: %s", employeeId, name, federalTaxIdmember);
    }
}
