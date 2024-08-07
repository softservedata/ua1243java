package com.softserve.edu04;

public class AppComp {

    public static void main(String[] args) {
        /*
        double d1 = 2.4;
        double d2 = 2.4;
        System.out.printf("(d1 == d2) = " + (d1 == d2)); // OK, value type
        */
        //
        Student st1 = new Student("Ivan", 21);
        Student st2 = new Student("Ivan", 21);
        System.out.println("(st1 == st2) = " + (st1 == st2)); // invalid solution, reference type
        System.out.println("st1.equals(st2) = " + st1.equals(st2));
        System.out.println("st1.hashCode() = " + st1.hashCode());
        System.out.println("st2.hashCode() = " + st2.hashCode());
        //
        System.out.printf("st1 = " + st1);
    }
}
