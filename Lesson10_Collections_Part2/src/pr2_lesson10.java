import java.util.*;

class Employee {
    private String name;
    private String position;
    private double salary;
    private String dateOfBirth;

    public Employee(String name, String position, double salary, String dateOfBirth) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getDateOfBirth() { return dateOfBirth; }

    @Override
    public String toString() {
        return "Name: " + name + ", Position: " + position + ", Salary: " + salary + ", DOB: " + dateOfBirth;
    }
}

public class pr2_lesson10 {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter employee ID: ");
            int id = scan.nextInt();
            scan.nextLine();

            if (employeeMap.containsKey(id)) {
                System.out.println("Duplicate ID found. Cannot add this employee.");
                i--;
                continue;
            }

            System.out.print("Enter employee name: ");
            String name = scan.nextLine();

            if (employeeMap.values().stream().anyMatch(e -> e.getName().equals(name))) {
                System.out.println("Duplicate name found. Cannot add this employee.");
                i--;
                continue;
            }

            System.out.print("Enter position: ");
            String position = scan.nextLine();

            System.out.print("Enter salary: ");
            double salary = scan.nextDouble();
            scan.nextLine();

            System.out.print("Enter date of birth (YYYY-MM-DD): ");
            String dateOfBirth = scan.nextLine();

            employeeMap.put(id, new Employee(name, position, salary, dateOfBirth));
        }

        System.out.println("Employee Map: ");
        employeeMap.forEach((id, employee) -> System.out.println("ID: " + id + ", " + employee));

        System.out.print("Enter employee ID: ");
        int searchId = scan.nextInt();
        if (employeeMap.containsKey(searchId)) {
            System.out.println("Employee Data: " + employeeMap.get(searchId));
        } else {
            System.out.println("ID not found in the employee map.");
        }

        scan.nextLine();
        System.out.print("Enter employee name: ");
        String searchName = scan.nextLine();
        boolean found = false;
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            if (entry.getValue().getName().equals(searchName)) {
                System.out.println("Employee ID: " + entry.getKey() + ", " + entry.getValue());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Name not found in the employee map.");
        }

        System.out.print("Enter ID of the employee you want to edit: ");
        int editId = scan.nextInt();
        if (employeeMap.containsKey(editId)) {
            Employee employee = employeeMap.get(editId);

            System.out.print("Enter new name (or press Enter to keep current name): ");
            scan.nextLine();
            String newName = scan.nextLine();
            if (!newName.isEmpty()) employee.setName(newName);

            System.out.print("Enter new position (or press Enter to keep current position): ");
            String newPosition = scan.nextLine();
            if (!newPosition.isEmpty()) employee.setPosition(newPosition);

            System.out.print("Enter new salary (or press Enter to keep current salary): ");
            String salaryInput = scan.nextLine();
            if (!salaryInput.isEmpty()) employee.setSalary(Double.parseDouble(salaryInput));

            System.out.println("Updated Employee: " + employee);
        } else {
            System.out.println("Employee ID not found.");
        }

        System.out.println("Choose sorting criteria (1: ID, 2: Name, 3: Position): ");
        int sortChoice = scan.nextInt();

        List<Map.Entry<Integer, Employee>> entryList = new ArrayList<>(employeeMap.entrySet());

        switch (sortChoice) {
            case 1:
                entryList.sort(Map.Entry.comparingByKey());
                break;
            case 2:
                entryList.sort(Comparator.comparing(entry -> entry.getValue().getName()));
                break;
            case 3:
                entryList.sort(Comparator.comparing(entry -> entry.getValue().getPosition()));
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Sorted Employee Map: ");
        entryList.forEach(entry -> System.out.println("ID: " + entry.getKey() + ", " + entry.getValue()));

        scan.close();
    }
}
