package com.softserve.edu.orest.hw6.task1;

public class Penguin extends NonFlyingBird {
    protected Penguin() {
        super(true, true);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Penguin");
    }
}
