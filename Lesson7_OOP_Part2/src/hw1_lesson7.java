import java.util.Arrays;

interface Payment {
    double calculatePay();
}

abstract class Employee implements Payment {
    protected String employeeId;
    protected String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public abstract String employeeDetails();
}

class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String employeeDetails() {
        return String.format("ID: %s, Name: %s, Social Security: %s", employeeId, name, socialSecurityNumber);
    }
}

class ContractEmployee extends Employee {
    private String federalTaxIdmember;
    private double hourlyRate;
    private int hoursWorked;

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
    public String employeeDetails() {
        return String.format("ID: %s, Name: %s, Federal Tax ID: %s", employeeId, name, federalTaxIdmember);
    }
}

public class hw1_lesson7 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("73", "Dima", "53535325", 50456);
        employees[1] = new ContractEmployee("45", "Banan", "356326236", 3, 30);
        employees[2] = new SalariedEmployee("112", "Oleg", "462355", 35135);
        employees[3] = new ContractEmployee("28", "Frukt", "1341535", 5, 50);

        Arrays.sort(employees, (e1, e2) -> Double.compare(e2.calculatePay(), e1.calculatePay()));

        for (Employee employee : employees) {
            System.out.printf("ID: %s, Name: %s, Monthly Salary: %.2f\n", employee.employeeId, employee.name, employee.calculatePay());
        }
    }
}
