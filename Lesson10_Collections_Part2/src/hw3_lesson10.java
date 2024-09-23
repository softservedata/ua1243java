import java.util.*;

class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int courseNumber) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Students enrolled in course " + courseNumber + ":");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == courseNumber) {
                System.out.println(student.getName());
            }
        }
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }

    @Override
    public String toString() {
        return "Student{Name='" + name + "', Course=" + course + "}";
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Oleg", 5));
        students.add(new Student("Did", 1));
        students.add(new Student("Dimon", 2));
        students.add(new Student("Alex", 4));
        students.add(new Student("KAren", 3));

        printStudents(students, 3);

        Collections.sort(students, Student.compareByName());
        System.out.println("\nStudents sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, Student.compareByCourse());
        System.out.println("\nStudents sorted by course:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
