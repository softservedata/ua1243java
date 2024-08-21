package task02;

import java.util.ArrayList;
import java.util.List;

public class StudentManagerApp {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Alice", "A1", 2);
        student1.addGrade("Math", 4);
        student1.addGrade("English", 5);
        students.add(student1);

        Student student2 = new Student("Bob", "A2", 3);
        student2.addGrade("Math", 2);
        student2.addGrade("English", 1);
        students.add(student2);

        Student student3 = new Student("Charlie", "A1", 2);
        student3.addGrade("Math", 3);
        student3.addGrade("English", 4);
        students.add(student3);

        StudentManager.removeOfUnsuccessful(students);

        StudentManager.printStudents(students, 2);
    }
}
