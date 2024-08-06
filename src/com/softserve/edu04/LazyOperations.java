package com.softserve.edu04;

public class LazyOperations {

    public static void main(String[] args) {
        int a = 37;
        int b = 24;
        String someText = "Some text";
        if (a > 50 && (b = 72) < 50){
            System.out.println(someText);
        }
        System.out.println(a);
        System.out.println(b);

        if (a > 50 & (b = 72) < 50){
            System.out.println(someText);
        }
        System.out.println(a);
        System.out.println(b);

        int c = 57;
        int d = 24;

        if (c > 50 || (d = 72) < 50){
            System.out.println(someText);
        }
        System.out.println(c);
        System.out.println(d);

        if (c > 50 | (d = 72) < 50){
            System.out.println(someText);
        }
        System.out.println(c);
        System.out.println(d);
    }
}
