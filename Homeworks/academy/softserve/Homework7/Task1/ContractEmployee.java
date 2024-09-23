package academy.softserve.Homework7.Task1;

public class ContractEmployee extends Employee {
    private double rateHour;
    private int workHours;
    private int federalTaxIdMember;

    public ContractEmployee(String employeeId, double rateHour, int workHours, int federalTaxIdMember) {
        super(employeeId);
        this.rateHour = rateHour;
        this.workHours = workHours;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getRateHour() {
        return rateHour;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return rateHour * workHours;
    }

    @Override
    public String toString() {
        return "Contract Employee " +
                "Pay: " + calculatePay() +
                ",rate hour "+ rateHour +
                ", work hours=" + workHours +
                ", federal Tax Id Member=" + federalTaxIdMember +
                ']';
    }
}
