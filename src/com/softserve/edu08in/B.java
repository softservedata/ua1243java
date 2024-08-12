package com.softserve.edu08in;

public class B extends A {
    public int j;

    public B() {
        System.out.println("\tConstructor B()");
    }

    @Override
    public void m1() {
        System.out.println("m1() from Class B");
        super.m1();
    }
}
