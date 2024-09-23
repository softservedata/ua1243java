package academy.softserve.Homework7.Task1;

public abstract class Employee implements Comparable<Employee>, Payment {
    private String employeeId;

    @Override
    public int compareTo(Employee that) {
        return (that.calculatePay() > this.calculatePay()) ? 1 : -1;
    }

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                '}';
    }
}




