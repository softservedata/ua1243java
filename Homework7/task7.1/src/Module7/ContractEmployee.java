package Module7;

import java.util.Objects;

public class ContractEmployee extends  Employee{
  private final int federalTaxIdMember;
  private double averageMonthlySalary;

  public ContractEmployee(String employeeId, String name,int federalTaxIdMember) {
    super(employeeId, name);
    this.federalTaxIdMember=federalTaxIdMember;
  }

  @Override
    public double calculatePay() {
      return averageMonthlySalary = fixedMonthlyPayment;

    }


  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), federalTaxIdMember, averageMonthlySalary);
  }

  @Override
  public String report(){
    return String.format( "Id: %s,Name: %s,  Salary: ₴ %.2f.", federalTaxIdMember,getName(),calculatePay());
  }

}
