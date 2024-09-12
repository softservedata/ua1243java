package homework.dmytro.livantsov.homeW_07_OOP_2Part_Task1;

import java.util.Objects;

public class ContractEmployee extends Employee implements Payment{

    private String federalTaxIdmember;
    private double hourlyRatePerMonth;
    private double feePerHour;

    public ContractEmployee(String name, String federalTaxIdmember, double hourlyRatePerMonth, double feePerHour) {
        this.name = name;
        this.employeeId = federalTaxIdmember;
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRatePerMonth = hourlyRatePerMonth;
        this.feePerHour = feePerHour;
    }

    @Override
    public double calculatePay() {
        this.salaryInMonth = feePerHour * hourlyRatePerMonth;
        return this.getSalaryInMonth();
    }

    public double getSalaryInMonth() {
        return salaryInMonth;
    }

    public double gethourlyRatePerMonth() {
        return hourlyRatePerMonth;
    }

    public double getFeePerHour() {
        return feePerHour;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember=" + federalTaxIdmember +
                ", contractOnHoursWorkedePerMonth=" + hourlyRatePerMonth +
                ", feePerHour=" + feePerHour +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ContractEmployee that = (ContractEmployee) o;
        return Double.compare(hourlyRatePerMonth, that.hourlyRatePerMonth) == 0 && Double.compare(feePerHour, that.feePerHour) == 0 && Objects.equals(federalTaxIdmember, that.federalTaxIdmember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), federalTaxIdmember, hourlyRatePerMonth, feePerHour);
    }
}
