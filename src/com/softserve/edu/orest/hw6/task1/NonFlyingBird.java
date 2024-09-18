package com.softserve.edu.orest.hw6.task1;

public abstract class NonFlyingBird extends Bird {

    protected NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly() {
        System.out.print("This non flying bird is ");
    }
}
