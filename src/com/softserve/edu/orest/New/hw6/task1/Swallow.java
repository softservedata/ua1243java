package com.softserve.edu.orest.New.hw6.task1;

public class Swallow extends FlyingBird {


    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Swallow can fly");
    }
}
