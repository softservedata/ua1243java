package academy.softserve.Homework9.Task2;

import java.util.List;
import java.util.Scanner;

/*
 Create a class called Student which includes the following fields: name, group, course, and
grades in different subjects. Create a collection that holds all objects. Write a methods that:
o removes students with a grade point average of less than 3. If a student's average score is
3 or higher, then they will be automatically promoted to the next course level.
o printStudents(List<Student> students, int course) which takes a list of students and a
course number as inputs. This method should print out the names of the students who
are enrolled in the specified course number to the console.
• In main() method create collection and output result.
 */
public class Student {
    private String name;
    private String group;
    private int course;
    private List<Double> grades;
    private Scanner scan;

    public Student(String name, String group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
        scan = new Scanner(System.in);
    }

    public double getAverageGrade() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void promoteCourse() {
        course++;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\n" + name + " " + group + " course " + course +
                " grades " + grades + " average grade" + getAverageGrade();
    }
}

