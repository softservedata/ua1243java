package homework.dmytro.livantsov.homeW_06_OOP_1Part_Task2;

public class MConsole {
    public static void main(String[] args) {
        Employee employee = new Employee("Dima", 24, 21_600);
        Developer developer = new Developer("Dmitry", 25, "Junior Developer", 30_000);

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
//Just like in the first task, here we can also create an array of type `Employee[]`
// that can hold both `Employee` and `Developer` objects. Thanks to polymorphism,
// calling the `report()` method for each object in this array will automatically invoke the appropriate method:
// either from the `Employee` class or the `Developer` class, depending on the object's type.
