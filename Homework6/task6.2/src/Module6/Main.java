package Module6;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Taras",32, "Average Java developer",45678);
        Employee emp = new Employee("Khrystyna",26,375843);
        System.out.println(dev.report());
        System.out.println( emp.report());

        }
}