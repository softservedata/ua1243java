package com.softserve.edu.orest.hw7;

public class ContractEmployee extends Employee{
    private final String federalTaxIdmember;
    private final double hourlyRate;
    private final int hoursWorked;

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
    public String toString() {
        return String.format("ID: %s, Name: %s, Federal Tax ID: %s", employeeId, name, federalTaxIdmember);
    }
}
