package com.softserve.edu15inner;

public interface IBase {

    public class E { // nested; static by default; class
        private int j = 456;

        public void work() {
            System.out.println("\tfrom E, j = " + j);
            m2();
        }
    }

    default void m1() {
        System.out.println("interface IBase; m1(): " + this); // this.toString()
    }

    static void m2() {
        System.out.println("interface IBase; static m2()");
    }
}
