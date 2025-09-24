package com.softserve.edu.orest.New.hw6.task1;

public class Penguin extends NonFlyingBird {


    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Penguin can not fly");
    }
}
