package com.softserve.edu01;

import java.util.List;

public class Main {
    private int i = 123;

    /**
     * <font color="red">Method</font><b> m1()</b>
     */
    public void m1() {
        System.out.println("\ti = " + i);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        //
        int k = 123;
        // This example demonstrates the use of single line comments
        String s = "variable k = "; // String s = new String("variable k = ");
        System.out.println(s + k);
        //
        Main m = new Main();
        System.out.println("variable m.i = " + m.i);
        //
        Main m2 = new Main();
        m2.i = 456;
        System.out.println("variable m2.i = " + m2.i);
        //
        /* This is a sample class which is used to demonstrate the use of multi-line comments.
         This comment does not appear in the java documentation
        */
        m.m1();
        m2.m1();
        //
        List l;
    }

}