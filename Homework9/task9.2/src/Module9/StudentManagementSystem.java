package Module9;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagementSystem {
    private final Map<Integer, Student> students = new HashMap<>();

    public StudentManagementSystem() {
        addStudent(new Student(
                5,
                "Khrystyna",
                "ua1243java",
                4));
        addStudent(new Student(
                4,
                "Oleksandr",
                "ua1243Kotlin",
                3));
    }
    private StudentManagementSystem addStudent(Student student) {
        students.put(student.grades(), student);
        return this;
    }
    public void run() {
        out:
        while (true) {
            showMainMenu();
            int option = readOption(4);
            switch (option) {
                case 1 -> showStudents();
                case 2 -> {
                    var student = promtNewStudent();
                    addStudent(student);
                }
                case 3 -> removeStudent();
                case 4 -> {
                    break out;
                }
            }
        }
        System.out.println("Bye!");
    }
    private void removeStudent() {
        if (students.containsKey(2) || students.containsKey(1) || students.containsKey(0)) {
            students.remove(0);
            students.remove(1);
            students.remove(2);
        }
        System.out.println(students);
    }
        private Student promtNewStudent () {
            var scan = new Scanner(System.in);
            System.out.println("Let's add new student!");
            System.out.println("Enter the grade for the new student: ");
            int grade = Integer.parseInt(scan.nextLine());
            if(grade>=3){
                System.out.println("Great! You will be automatically promoted to the next course level!");
            }
            System.out.println("Please enter the name: ");
            String name = scan.nextLine();
            System.out.println("Please enter the group: ");
            String group = scan.nextLine();
            System.out.println("Please enter the amount of  course: ");
            int course = Integer.parseInt(scan.nextLine());
            System.out.println("Please enter the level of  course: ");
            CourseLevel courseLevel = readLevel();

            return new Student(
                    grade,
                    name,
                    group,
                    course
            );
        }
        private CourseLevel readLevel () {
            var scan = new Scanner(System.in);
            System.out.println("Enter level (one of " +
                    Arrays.toString(CourseLevel.values()) + "):");
            var courseLevel = scan.nextLine();
            return CourseLevel.valueOf(courseLevel.trim().toUpperCase());

        }
        private void showStudents () {
            if (students.isEmpty()) {
                System.out.println("There are no students yet.");
            } else {
                for (var entry : students.entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }

            }
        }
        private int readOption ( int nOptions){
            System.out.println("Enter option from 1 to " + nOptions + ":");
            var scan = new Scanner(System.in);
            return  Integer.parseInt(scan.nextLine());
        }
        private void showMainMenu () {
            System.out.println("""
                    Main menu:
                    1. Show students
                    2. Add new student
                    3. Remove student
                    4. Exit
                    """
            );
        }
    }
