package com.softserve.edu.orest.New.hw7;

public class ContractEmployee extends Employee implements Payment{

    private int hourlyPaid;
    private int numberOfHours;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, int hourlyPaid, int numberOfHours, String federalTaxIdMember) {
        super(employeeId);
        this.hourlyPaid = hourlyPaid;
        this.numberOfHours = numberOfHours;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return hourlyPaid * numberOfHours;
    }
}
