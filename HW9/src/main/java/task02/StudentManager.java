package task02;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private static final double MINIMAL_GRADE = 3.0;

    public static void removeOfUnsuccessful(List<Student> students) {
        if (students == null || students.isEmpty()) {
            System.out.println("The student list is null or empty.");
            return;
        }

        List<Student> toRemove = new ArrayList<>();

        for (Student student : students) {
            if (student.getAverageGrade() < MINIMAL_GRADE) {
                toRemove.add(student);
            }
        }
        students.removeAll(toRemove);

        for (Student student : students) {
            student.setCourse(student.getCourse() + 1);
        }
    }

    public static void printStudents(List<Student> students, int course) {
        if (students == null || students.isEmpty()) {
            System.out.println("The student list is null or empty.");
            return;
        }

        for(Student student: students){
            if(student.getCourse() == course){
                System.out.println(student);
            }
        }
    }
}
