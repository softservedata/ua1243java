package com.softserve.edu01;

public class Person {
    private String name;
    private static int count = 0;

//    static {
//        count = 0;
//    }

    public Person(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

}
