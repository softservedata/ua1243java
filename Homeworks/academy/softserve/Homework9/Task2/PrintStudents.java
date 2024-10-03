package academy.softserve.Homework9.Task2;

import java.util.List;

public class PrintStudents extends Student {
    public PrintStudents(String name, String group, int course, List<Double> grades) {
        super(name, group, course, grades);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("on " + course + " course study :");
        boolean areStudents = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                areStudents = true;
                System.out.println(student.getName());
            }
        }
        if (!areStudents) {
            System.out.println("on " + course + " course no students :");
        }
    }
}
