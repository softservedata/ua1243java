package com.softserve.edu.orest.New.hw6.task1;

public class Kiwi extends NonFlyingBird {


    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Kiwi can not fly");
    }
}
