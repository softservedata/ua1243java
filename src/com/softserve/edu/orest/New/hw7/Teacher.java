package com.softserve.edu.orest.New.hw7;

public class Teacher extends Staff{

    private static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    int salary() {
        return 20000;
    }


}
