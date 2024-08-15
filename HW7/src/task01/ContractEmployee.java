package task01;

public class ContractEmployee extends Employee{
    private double hourlyRate;
    private double numberOfHours;
    private String federalTaxIdMember;
    public ContractEmployee(String id, String federalTaxIdMember, double hourlyRate, double numberOfHours) {
        super(id);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }
    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHours;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }
    @Override
    public String toString() {
        return String.format("ContractEmployee [ID: %s, Hourly Rate: %.2f, Hours Worked: %.2f, Pay: %.2f, Federal Tax ID: %s]",
                getEmployeeId(), hourlyRate, numberOfHours, calculatePay(), federalTaxIdMember);
    }
}
