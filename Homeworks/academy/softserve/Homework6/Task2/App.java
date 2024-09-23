package academy.softserve.Homework6.Task2;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Denis", 25, 13900.0);
        Employee developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
