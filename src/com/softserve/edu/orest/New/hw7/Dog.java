package com.softserve.edu.orest.New.hw7;

public class Dog implements Animal{
    public Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Гав-гав");
    }

    @Override
    public void feed() {
        System.out.println("Їсть мясо");
    }
}
