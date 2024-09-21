package HW7;
import java.util.Arrays;

interface Payment {
    double calculatePay();
}

abstract class Employee implements Payment {
    String employeeId;
    String name;

    Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public abstract double calculatePay();
}

class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}

class ContractEmployee extends Employee {
    private String federalTaxIdMember;
    private double hourlyRate;
    private int hoursWorked;

    ContractEmployee(String employeeId, String name, String federalTaxIdMember, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Calculate pay for contract employees
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new SalariedEmployee("E001", "Anastasiia", "SSN12345", 3000.00),
                new ContractEmployee("E002", "Oksana", "TID98765", 20.00, 160),
                new SalariedEmployee("E003", "Volodymyr", "SSN67890", 4000.00),
                new ContractEmployee("E004", "Max", "TID54321", 25.00, 150)
        };

        Arrays.sort(employees, (e1, e2) -> Double.compare(e2.calculatePay(), e1.calculatePay()));

        System.out.println("Employee ID | Name | Average Monthly Wage");
        System.out.println("------------------------------------------");
        for (Employee employee : employees) {
            System.out.printf("%s | %s | %.2f%n", employee.employeeId, employee.name, employee.calculatePay());
        }
    }
}

