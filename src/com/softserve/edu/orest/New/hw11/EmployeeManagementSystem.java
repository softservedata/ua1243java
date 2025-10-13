package com.softserve.edu.orest.New.hw11;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class EmployeeManagementSystem {

    private Map<Integer, Employee> employees = new LinkedHashMap<>();

    public EmployeeManagementSystem() {
        addEmployee(new Employee(1, "Alice", Position.DEV, 10000, LocalDate.parse("1999-01-30")));
        addEmployee(new Employee(2, "Bob", Position.QA, 10000, LocalDate.parse("2000-03-03")));
    }

    private void addEmployee(Employee employee){
        if (employees.containsKey(employee.id())) {
            throw new IllegalArgumentException("Employee with id = " + employee.id() + " already exists");
        }
        employees.put(employee.id(), employee);
    }

    public void run() {
        out: while (true) {
            showMainMenu();
            int option = readOption(5);
            switch (option) {
                case 1 -> showEmployees();
                case 2 -> {
                    var employee = promptNewEmployee();
                    addEmployee(employee);
                }
                case 3 -> editEmployee();
                case 4 -> sortEmployees();
                case 5 -> {break out;}
            }
        }
        System.out.println("Bye!");
    }

    private void sortEmployees() {
        System.out.println("""
                Choose the sorting criteria:
                  1. id
                  2. name
                  3. position
                """);
        int option = readOption(3);
        Comparator<Employee> comparator = switch (option) {
            case 1 -> Comparator.comparing(Employee::id);
            case 2 -> Comparator.comparing(Employee::name);
            case 3 -> Comparator.comparing(Employee::position);
            default -> throw new IllegalStateException("Never should be here");
        };
        List<Employee> employeeList = new ArrayList<>(employees.values());
        employeeList.sort(comparator);
        employees = new LinkedHashMap<>();
        for (var employee : employeeList) {
            employees.put(employee.id(), employee);
        }
        showEmployees();
    }

    private void editEmployee() {
        var scan = new Scanner(System.in);
        System.out.println("Enter id of the employee to edit");
        int id = Integer.parseInt(scan.nextLine());
        var employee = employees.get(id);
        if (employee == null) {
            System.out.println("There is no employee with id = " + id);
            return;
        }
        System.out.println("The current name is " + employee.name());
        System.out.println("Enter new name or an empty line to keep current");
        String name = scan.nextLine().trim();
        if (!name.isEmpty()) {
            employee = employee.withName(name);
        }
        System.out.println("The current position is " + employee.position());
        System.out.println("Enter new position (one of " + Arrays.toString(Position.values()) + "):\n" + " or an empty line to keep current");
        String positionText = scan.nextLine().trim().toUpperCase();
        if (!positionText.isEmpty()) {
            Position newPosition = Position.valueOf(positionText);
            employee = employee.withPosition(newPosition);
        }
        System.out.println("The current salary is " + employee.salary());
        System.out.println("Enter new salary or an empty line to keep current");
        String salaryText = scan.nextLine().trim();
        if (!salaryText.isEmpty()) {
            double newSalary = Double.parseDouble(salaryText);
            employee = employee.withSalary(newSalary);
        }
        employees.put(id, employee);
    }

    private int readIdForNewEmployee() {
        var scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter id for the new employee: ");
            int id = Integer.parseInt(scan.nextLine());
            if (!employees.containsKey(id)) {
                return id;
            }
            System.out.println("Such id is already occupied, choose another one");
        }
    }

    private Position readPosition() {
        var scan = new Scanner(System.in);
        System.out.println("Enter position (one of " + Arrays.toString(Position.values()) + "):");
        var positionText = scan.nextLine();
        return Position.valueOf(positionText.trim().toUpperCase());
    }

    private Employee promptNewEmployee() {
        var scan = new Scanner(System.in);
        System.out.println("Let's add new employee");
        int id = readIdForNewEmployee();
        System.out.println("Enter name:");
        String name = scan.nextLine();
        Position position = readPosition();
        System.out.println("Enter salary:");
        double salary = Double.parseDouble(scan.nextLine());
        System.out.println("Enter teh date of birth (use format 1999-01-30)");
        LocalDate dob = LocalDate.parse(scan.nextLine().trim());

        return new Employee(id, name, position, salary, dob);
    }

    private void showEmployees() {
        if (employees.isEmpty()) {
            System.out.println("There are no employees yet");
        } else {
            for (var entry : employees.entrySet())
                System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private int readOption(int nOptions) {
        System.out.println("Enter option (1.." + nOptions + ")");
        var scan = new Scanner(System.in);
        int res = Integer.parseInt(scan.nextLine());
        return res;
    }

    private void showMainMenu() {
        System.out.println("""
                Main menu:
                  1. Show employees
                  2. Add new employee
                  3. Edit employee
                  4. Sort
                  5. Exit
                """);
    }

}
