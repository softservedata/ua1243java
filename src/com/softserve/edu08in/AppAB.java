package com.softserve.edu08in;

public class AppAB {

    public static void main(String[] args) {
        /*
        //A b = new A();
        //B b = new B();
        IA b = new B();
        //
        System.out.println("b.getI() = " + b.getI());
        //b.m1();
        //b.m1("hello");
        if (b instanceof A) {
            ((A) b).m1();
            ((A) b).m1("hello");
        }
        */
        //
        //AA a = new AA() {};
        //
        A a = new A();
        //A a = new B();
        B b = new B();
        //
        b = (B) a; // Runtime Error if A a = new A();
        //
    }
}
