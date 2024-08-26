package task03;

import java.util.ArrayList;
import java.util.List;

public class StudentOperationsApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 3));
        students.add(new Student("David", 2));
        students.add(new Student("Eva", 1));

        System.out.println("Students: ");
        StudentOperations.printStudents(students);

        System.out.println("Student in course 1: " );
        StudentOperations.printStudentsByCourse(students, 1);

        System.out.println("Students sorted by name: ");
        students.sort(StudentOperations.compareByName());
        StudentOperations.printStudents(students);

        System.out.println("Students sorted by course: ");
        students.sort(StudentOperations.compareByCourse());
        StudentOperations.printStudents(students);
    }
}
