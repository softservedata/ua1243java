import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pr1_lesson10 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(0, "Oleg");
        employeeMap.put(1, "Dima");
        employeeMap.put(2, "Yaroslav");
        employeeMap.put(3, "Artem");
        employeeMap.put(4, "Alex");
        employeeMap.put(5, "Roman");
        employeeMap.put(6, "Nikola");

        System.out.println("Employee Map: " + employeeMap);

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int id = scan.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("Employee Name: " + employeeMap.get(id));
        } else {
            System.out.println("ID not found in the employee map.");
        }

        scan.nextLine();
        System.out.print("Enter employee name: ");
        String name = scan.nextLine();
        if (employeeMap.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("Employee ID: " + entry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("Name not found in the employee map.");
        }
        scan.close();
    }
}
