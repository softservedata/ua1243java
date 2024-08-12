package com.softserve.edu01;

public class AppPerson {
    public static void main(String[] args) {
        Person[] people = {new Person("Ivan"),
                new Person("Perto"),
                new Person("Ira")
        };
        System.out.println("people[0].getCount() = " + people[0].getCount()); // Invalid Solution
        System.out.println("Person.getCount() = " + Person.getCount()); // OK
    }
}
