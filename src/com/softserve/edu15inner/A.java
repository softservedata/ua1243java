package com.softserve.edu15inner;

public class A {

    public class B { // inner class
        private int j = 456;

        public void work() {
            System.out.println("\tfrom B, j = " + j + "  i = " + i);
            i = 1230;
            System.out.println("\tfrom B, updated i = " + i);
        }
    }

    private int i = 123;

    public void todo(B b) {
        System.out.println("\tfrom A, j = " + b.j + "  i = " + i);
        b.j = 4561;
        System.out.println("\tfrom A, updated b.j = " + b.j);
    }

    public int getI() {
        return i;
    }
}
