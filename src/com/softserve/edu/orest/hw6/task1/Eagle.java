package com.softserve.edu.orest.hw6.task1;

public class Eagle extends FlyingBird {

    public Eagle() {
        super(true, true);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Eagle");
    }
}
