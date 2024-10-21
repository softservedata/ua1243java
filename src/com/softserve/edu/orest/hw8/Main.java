package com.softserve.edu.orest.hw8;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        FullName fullName1 = new FullName("Іван", "Іванович");
        FullName fullName2 = new FullName("Василь", "Васильович");

        Student student1 = new Student(fullName1, 25, 1);
        Student student2 = new Student(fullName2, 29, 2);

        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());

        Student clonedStudent = student1.clone();
        clonedStudent.setCourse(3);

        System.out.println("\nAfter cloning and changing course:");
        System.out.println(student1.info());
        System.out.println(clonedStudent.info());
    }
}
