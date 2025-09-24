package com.softserve.edu.orest.New.hw6.task1;

abstract class Bird {
    boolean feathers = true;
    boolean layEggs = true;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract void fly();
}
