package academy.softserve.Homework7.Task1;

public class SalariedEmployee extends Employee{
    private int fixedSalary;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, int fixedSalary, String socialSecurityNumber) {
        super(employeeId);
        this.fixedSalary = fixedSalary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return fixedSalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee [" +
                "Pay " + fixedSalary +
                ", Social Security Number " + socialSecurityNumber + '\'' +
                ']';
    }
}


