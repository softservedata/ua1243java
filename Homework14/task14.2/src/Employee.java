import java.util.Objects;

public class Employee {
    private final int employeeId;
    private final String name;

    public Employee(int employeeId, String name) {
            this.employeeId = employeeId;
            this.name = name;
        }
    public String getName() {
            return name;
        }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
        public int hashCode() {
            return Objects.hash(employeeId, name);
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(employeeId, employee.employeeId) && Objects.equals(name, employee.name);
    }
}

