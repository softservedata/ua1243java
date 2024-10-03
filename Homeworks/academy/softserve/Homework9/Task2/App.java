package academy.softserve.Homework9.Task2;

import java.util.ArrayList;
import java.util.List;

import static academy.softserve.Homework9.Task2.PrintStudents.printStudents;
import static academy.softserve.Homework9.Task2.RemoveStudents.removeStudents;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kolya", "ITS5", 2, List.of(3.0, 5.0, 2.0, 2.0)));
        students.add(new Student("Anton", "ITS3", 3, List.of(3.0, 5.0, 4.0, 1.0)));
        students.add(new Student("Dima", "ITS1", 2, List.of(3.0, 5.0, 2.0, 3.0)));
        students.add(new Student("Pasha", "ITS5", 1, List.of(3.0, 5.0, 2.0, 1.0)));

        System.out.println("Students before update: " + students.toString());
        removeStudents(students);

        System.out.println("Students after update: " + students.toString());

        printStudents(students, 3);
    }
}
