package homework.dmytro.livantsov.homeW_07_OOP_2Part_Task1;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    String employeeId;
    String name;
    double salaryInMonth;

    public Employee(){
        employeeId = "00000";
        name = "Unnamed";
        salaryInMonth = 0.0;
    }

    @Override
    public int compareTo(Employee o) {
        return - Double.compare(salaryInMonth, o.salaryInMonth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salaryInMonth, employee.salaryInMonth) == 0 && Objects.equals(employeeId, employee.employeeId) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name, salaryInMonth);
    }
}
