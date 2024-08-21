package task02;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, String group, int course) {
        if (name == null || group == null) {
            throw new IllegalArgumentException("Name and group cannot be null.");
        }
        if (course <= 0) {
            throw new IllegalArgumentException("Course must be a positive number.");
        }
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, int grade) {
        if (subject == null) {
            throw new IllegalArgumentException("Subject cannot be null.");
        }
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        grades.put(subject, grade);
    }

    public Integer getGrade(String subject) {
        if (subject == null) {
            throw new IllegalArgumentException("Subject cannot be null.");
        }
        return grades.get(subject);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return -1;
        }
        int sum = 0;
        for (Integer grade : grades.values()) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        if (group == null) {
            throw new IllegalArgumentException("Group cannot be null.");
        }
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course <= 0) {
            throw new IllegalArgumentException("Course must be a positive number.");
        }
        this.course = course;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        if (grades == null) {
            throw new IllegalArgumentException("Grades map cannot be null.");
        }
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student: " + name +
                ", Group: " + group +
                ", Course: " + course +
                ", Grades: " + grades +
                ", GPA: " + String.format("%.2f", getAverageGrade());
    }
}
