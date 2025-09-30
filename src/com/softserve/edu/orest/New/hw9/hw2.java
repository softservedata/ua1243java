package com.softserve.edu.orest.New.hw9;

public class hw2 {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Ivan", "Ivanov"), 21, 55);
        Student student2 = new Student(new FullName("Sofia", "Shevchenko"), 20, 50);

        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());

        Student student3 = student1.clone();
        student3.setCourse(45);

        System.out.println(student3.info());
        System.out.println(student3.activity());

    }


}
