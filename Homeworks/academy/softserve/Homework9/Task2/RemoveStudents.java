package academy.softserve.Homework9.Task2;

import java.util.Iterator;
import java.util.List;

public class RemoveStudents extends Student {
    public RemoveStudents(String name, String group, int course, List<Double> grades) {
        super(name, group, course, grades);
    }

    public static void removeStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.promoteCourse();
            }
        }
    }
}