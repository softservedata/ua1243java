package com.softserve.edu.orest.hw3;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private Integer birthYear;

    //gets&sets
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

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    //constructors
    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //methods
    public void input() {
        System.out.println("Enter first name:");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        System.out.println("Enter last name:");
        String lastName = scanner.next();
        System.out.println("Enter birth year:");
        Integer birthYear = scanner.nextInt();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void output() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(getAge());
    }

    public void changeName(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }
    public Integer getAge(){
        LocalDate now = LocalDate.now();
        Integer year = now.getYear();
        Integer age = year - birthYear;
        return age;
    }
}

