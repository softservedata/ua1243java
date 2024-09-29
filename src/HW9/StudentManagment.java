package HW9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Group: " + group + ", Course: " + course + ", Average Grade: " + getAverageGrade();
    }
}

public class StudentManagment {
    public static void removeAndPromoteStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students enrolled in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Anastasiia", "Group1", 2, List.of(4, 5, 3)));
        studentList.add(new Student("Oksana", "Group1", 2, List.of(2, 2, 3)));
        studentList.add(new Student("Martha", "Group2", 1, List.of(5, 4, 4)));
        studentList.add(new Student("Max", "Group2", 1, List.of(3, 3, 2)));
        studentList.add(new Student("Tymofiy", "Group1", 3, List.of(5, 5, 5)));

        System.out.println("Initial list of students:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        removeAndPromoteStudents(studentList);

        System.out.println("\nAfter removing and promoting students:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        int course = 2;
        printStudents(studentList, course);
    }
}
