package com.softserve.edu.orest.hw8;

public class Student extends Person implements Cloneable{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }
    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university.";
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
            return (Student) super.clone();
    }
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}


