package com.softserve.edu.orest.New.hw6.task1;

public class Eagle extends FlyingBird {

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Eagle can fly");
    }
}
