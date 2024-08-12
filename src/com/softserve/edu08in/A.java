package com.softserve.edu08in;

//public class A extends Object {
public class A {
    private int i;

    public A() {
        i = 123;
        System.out.println("\tConstructor A()");
    }

    public A(int i) {
        this.i = i;
        System.out.println("\tConstructor A(int i)");
    }

    public int getI() {
        return i;
    }

    public void m1() {
        System.out.println("m1() from Class A");
    }

    // Overload
    public void m1(String msg) {
        System.out.println("m1(String msg) from Class A = " + msg);
    }
}
