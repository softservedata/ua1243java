package homework.dmytro.livantsov.homeW_07_OOP_2Part_Task1;

import java.util.Objects;

public class SalariedEmployee extends Employee implements Payment{

    private String socialSecurityNumber;
    private double fixedMonthlyPayment;


    public SalariedEmployee(String name, String socialSecurityNumber, double fixedMonthlyPayment){
        this.name = name;
        this.employeeId = socialSecurityNumber;
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }


    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    @Override
    public double calculatePay() {
        this.salaryInMonth = fixedMonthlyPayment;
        return this.getFixedMonthlyPayment();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return Double.compare(fixedMonthlyPayment, that.fixedMonthlyPayment) == 0 && Objects.equals(socialSecurityNumber, that.socialSecurityNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), socialSecurityNumber, fixedMonthlyPayment);
    }
}
