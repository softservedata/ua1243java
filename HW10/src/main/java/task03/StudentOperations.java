package task03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentOperations {
    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void printStudentsByCourse(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static Comparator<Student> compareByName() {
        return new Comparator<>() {

            @Override
            public int compare(Student student1, Student student2) {
                return student1.getName().compareTo(student2.getName());
            }
        };
    }

    public static Comparator<Student> compareByCourse() {
        return new Comparator<>() {

            @Override
            public int compare(Student student1, Student student2) {
                return Integer.compare(student1.getCourse(), student2.getCourse());
            }
        };
    }

}
