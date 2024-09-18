package com.softserve.edu.orest.hw6.task1;

public abstract class FlyingBird extends Bird {

    protected FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.print("This flying bird is ");
    }
}
