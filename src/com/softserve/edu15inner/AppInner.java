package com.softserve.edu15inner;

public class AppInner {

    public static void main(String[] args) {
        /*
        A a = new A();
        A.B b = a.new B();
        //
        //a.todo(b);
        b.work();
        System.out.println("i = " + a.getI());
        //
        System.out.println("done");
        */
        //
        C.D d = new C.D();
        C c = new C();
        //d.work(c);
        //
        c.todo(d);
    }
}
