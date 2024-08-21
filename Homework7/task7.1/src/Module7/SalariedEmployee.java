package Module7;

import java.util.Objects;

public class SalariedEmployee extends Employee{
    private final String socialSecurityNumber;
   // private double averageMonthlySalary;
    private final double numberOfHoursWorked;

    public SalariedEmployee(String employeeId, String name, double numberOfHoursWorked, String socialSecurityNumber) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.numberOfHoursWorked=numberOfHoursWorked;

    }

    @Override
    public double  calculatePay() {
      return hourlyRate * numberOfHoursWorked;


    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), socialSecurityNumber, numberOfHoursWorked);
    }
    @Override
    public String report(){
        return String.format( "Id: %s,Name: %s,  Salary: ₴ %.2f.", socialSecurityNumber,getName(),calculatePay());


    }

}
