import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = getStudents();

        Student.printStudent(students);

        System.out.println("Sorted list by the length of name: " );
        students.sort(Student.getCompByName());
        Student.printStudent(students);

        System.out.println("Sorted list by the amount of course: " );
        students.sort(Student.getCompByCourse());
        Student.printStudent(students);
    }

    private static List<Student> getStudents() {
        Student student1 = new Student("Oksana Svoren",3);
        Student student2 = new Student("Roman Tsvyk",2);
        Student student3 = new Student("Khrystyna Martynova",3);
        Student student4 = new Student("Oleksandr Martynov",5);
        Student student5 = new Student("Svitlana Tsvyk",2);
        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        return students;
    }
}