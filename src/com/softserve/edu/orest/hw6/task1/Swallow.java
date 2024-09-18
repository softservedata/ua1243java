package com.softserve.edu.orest.hw6.task1;

public class Swallow extends FlyingBird {

    protected Swallow() {
        super(true, true);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Swallow");
    }
}
