package com.softserve.edu.orest.hw6.task1;

public class Kiwi extends NonFlyingBird{
    protected Kiwi() {
        super(true, true);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Kiwi");
    }
}
