package task02;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Ivan", 45, 50000.00);
        System.out.println("Employee Info: " + employee.report());

        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");
        System.out.println("Developer Info: " + developer.report());
    }
}
