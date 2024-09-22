class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f", name, age, salary);
    }
}

class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s, Salary: \u20B4 %.2f",
                getName(), getAge(), position, getSalary());
    }
}

public class hw2_lesson6 {
    public static void main(String[] args) {
        Employee employee = new Employee("Dima", 15, 30000.00);
        System.out.println(employee.report());

        Developer developer = new Developer("Oleg", 90, 545000.00, "Average Java developer");
        System.out.println(developer.report());
    }
}
