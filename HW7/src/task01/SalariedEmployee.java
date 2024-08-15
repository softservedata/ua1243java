package task01;

public class SalariedEmployee extends Employee{
    private String socialSecurityNumber;
    private double salary;

    SalariedEmployee(String id, String socialSecurityNumber, double salary) {
        super(id);
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    @Override
    public String toString() {
        return String.format("SalariedEmployee [ID: %s, Salary: %.2f, SSN: %s]", getEmployeeId(), calculatePay(), socialSecurityNumber);
    }
}
