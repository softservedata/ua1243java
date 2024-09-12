package homework.dmytro.livantsov.homeW_06_OOP_1Part_Task2;

public class MConsole {
    public static void main(String[] args) {
        Employee employee = new Employee("Dima", 24, 21_600);
        Developer developer = new Developer("Dmitry", 25, "Junior Developer", 30_000);

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
