package com.softserve.edu.orest.New.hw9;

public abstract class Person extends FullName{
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        super(fullName.getFirstName(), fullName.getLastName());
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return "First name: " + getFirstName() + ", Last name: " + getLastName() + ", Age: " + age;
    }

    public abstract String activity();
}
