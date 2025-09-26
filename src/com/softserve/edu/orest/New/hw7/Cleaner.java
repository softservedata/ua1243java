package com.softserve.edu.orest.New.hw7;

public class Cleaner extends Staff{

    private static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a cleaner");
    }

    @Override
    int salary() {
        return 19000;
    }
}
