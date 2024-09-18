package HW6;

public class MainD {
    public static void main(String[] args) {
        Employee employee = new Employee("Oleh", 45, 50000.00);

        Developer developer = new Developer("Taras", 32, 32735.35, "Middle Java Developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}

