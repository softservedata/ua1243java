package com.softserve.edu.orest.New.hw7;

public class Task2 {
    public static void main(String[] args) {
        Person[] people = {
                new Cleaner("Василь"),
                new Student("Максим"),
                new Teacher("Євген")
        };

        for (var person : people) {
            person.print();
            if (person instanceof Staff staff) {
                System.out.println("My salary is " + staff.salary());
            }
        }
    }
}
