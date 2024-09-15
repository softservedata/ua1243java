package task02;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

    private String name;
    private String position;
    private BigDecimal salary;
    private LocalDate hireDate;

    public Employee(String name, String position, BigDecimal salary, LocalDate hireDate) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getYearsAtCompany() {
        return LocalDate.now().getYear() - hireDate.getYear();
    }

    @Override
    public String toString() {
        return String.format("Name: %-20s | Position: %-15s | Salary: %10.2f | Hire Date: %s",
                name,
                position,
                salary,
                hireDate.toString());
    }
}

