package com.softserve.edu15inner;

public class C {

    public static class D { // nested class
        private int j = 456;

        public void work(C c) {
            System.out.println("\tfrom D, j = " + j + "  i = " + c.i + "  i2 = " + i2);
            c.i = 1230;
            i2 = 12321;
            System.out.println("\tfrom D, updated i = " + c.i + "  i2 = " + i2);
        }
    }

    private int i = 123;
    private static int i2 = 123;

    public void todo(C.D d) {
        System.out.println("\tfrom C, j = " + d.j + "  i = " + i);
        d.j = 4561;
        System.out.println("\tfrom C, updated d.j = " + d.j);
    }

    public int getI() {
        return i;
    }

}
