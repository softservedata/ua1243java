package com.softserve.edu.orest.New.hw7;

public class Cat implements Animal{
    public Cat() {
    }

    @Override
    public void voice() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public void feed() {
        System.out.println("Їсть рибу");
    }
}
