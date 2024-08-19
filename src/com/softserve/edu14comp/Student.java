package com.softserve.edu14comp;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {

    public static class ByAge implements Comparator<Student> {
        @Override
        public int compare(Student student0, Student student1) {
            return student0.getAge() - student1.getAge();
        }
    }

    public static class ByNameAndAge implements Comparator<Student> {
        @Override
        public int compare(Student student0, Student student1) {
            int result = student0.getName().compareTo(student1.getName());
            return result == 0 ? student0.getAge() - student1.getAge() : result;
        }
    }

    // - - - - - - - - - -

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "\n\tStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return getName().compareTo(student.getName());
        //return getAge() - student.getAge();
    }
}
