package com.softserve.edu04;

public class IfElseIfExample {
    public static void main(String[] args) {
        int a = 14;
        int b = 10;

        if (a > 15) {
            System.out.println("a is greater than 15");
        } else if (a == 15) {
            System.out.println("a is equal to 15");
        } else if (a < 15) {
            System.out.println("a is not greater than 15");
        } else {
            System.out.println("a not number");
        }
        System.out.println("End");

        if (a == 14) {
            if (b == 10) {
                System.out.println("b is greater or equal than 10");
            }
        }
        //other way
        if (a == 14 && b == 10) {
            System.out.println("Option second");
        }
        System.out.println("End");

    }
}
