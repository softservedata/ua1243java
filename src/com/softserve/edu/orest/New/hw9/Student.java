package com.softserve.edu.orest.New.hw9;

public class Student extends Person implements Cloneable{
    private int course;

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", course " + course;
    }

    @Override
    public String activity() {
        return "Student";
    }

    public int getCourse() {
        return course;
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }


}
