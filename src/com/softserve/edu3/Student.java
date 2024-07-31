package com.softserve.edu3;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    //default constructor
    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }

    //constructor with parameters
    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Student(int age, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Student(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 150) {
            // System.out.println("Age is not correct");
            throw new IllegalArgumentException("Age is not correct");
        } else {
            this.age = age;
        }
    }

    public String print(String message, double value){
        return "From method 1 String type";//TODO
    }

    public void print(String message, int value){
        System.out.println("Hello fom void message");//TODO
    }

    @Override
    public String toString() {
        return "Student[" +
                "firstName:'" + firstName + '\'' +
                ", lastName:'" + lastName + '\'' +
                ", age:" + age +
                ']';
    }
}

class App {
    public static void main(String[] args) {
        Student student1 = new Student("Green", "Alice", 19);
//        student1.firstName = "Alice";
//        student1.lastName = "Green";
//        student1.age = 19;

        Student student2 = new Student();

        student2.setFirstName("Bob");
        student2.setLastName("Brown");
        student2.setAge(20); //exception

//        System.out.println(student2.getAge());
//        System.out.println(student2.getLastName());
//        //System.out.println(student2.print("Hello"));
//        student2.print("message", 50);
        System.out.println(student1);


    }
}

