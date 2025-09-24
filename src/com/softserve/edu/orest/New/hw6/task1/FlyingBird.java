package com.softserve.edu.orest.New.hw6.task1;

public class FlyingBird extends Bird {


    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("This bird can fly");
    }
}
