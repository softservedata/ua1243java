package com.softserve.edu.orest.hw6.task1;

public abstract class Bird {
    protected final boolean feathers;
    protected final boolean layEggs;


    protected Bird (boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public abstract void fly();

}
