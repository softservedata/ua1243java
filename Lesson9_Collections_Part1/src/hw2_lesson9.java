import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String group;
    private int course;
    private List<Double> grades;

    public Student(String name, String group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public double calculateAverage() {
        return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public void promote() {
        this.course++;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', group='" + group + "', course=" + course + ", grades=" + grades + "}";
    }
}

public class hw2_lesson9 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("StandartOleg", "A1", 1, List.of(3.5, 4.0, 2.5)));
        students.add(new Student("Oleg", "B1", 2, List.of(2.0, 1.5, 2.5)));
        students.add(new Student("StandartOleg", "A1", 1, List.of(4.0, 3.5, 4.0)));
        students.add(new Student("Oleg", "B2", 2, List.of(5.0, 4.5, 4.5)));
        students.add(new Student("Olegiant", "C2", 3, List.of(5.0, 5.0, 5.0)));

        removeAndPromoteStudents(students);

        int courseToPrint = 2;
        printStudents(students, courseToPrint);
    }

    public static void removeAndPromoteStudents(List<Student> students) {
        students.removeIf(student -> {
            double average = student.calculateAverage();
            if (average < 3) {
                return true;
            } else {
                student.promote();
                return false;
            }
        });
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
