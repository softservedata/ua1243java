import java.util.Arrays;
import java.util.Scanner;

class Employee {
    String name;
    int departmentNumber;
    double salary;

    Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', departmentNumber=" + departmentNumber + ", salary=" + salary + '}';
    }
}

public class pr4_lesson5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Oleg", 1, 50000);
        employees[1] = new Employee("Max", 2, 60000);
        employees[2] = new Employee("Marta", 1, 55000);
        employees[3] = new Employee("Marusia", 3, 70000);
        employees[4] = new Employee("Dimon", 2, 65000);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter department number: ");
        int departmentNumber = scan.nextInt();

        System.out.println("Employees in department " + departmentNumber + ":");
        for (Employee employee : employees) {
            if (employee.departmentNumber == departmentNumber) {
                System.out.println(employee);
            }
        }

        Arrays.sort(employees, (e1, e2) -> Double.compare(e2.salary, e1.salary));

        System.out.println("\n\tSorted by salary in descending order:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        scan.close();
    }
}
