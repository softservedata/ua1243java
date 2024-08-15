package task01;

public abstract class Employee implements Payment {
    private final String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
