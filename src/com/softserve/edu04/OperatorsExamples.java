package com.softserve.edu04;

import java.util.Random;

public class OperatorsExamples {
    public static void main(String[] args) {
        int x = 11;
        int y = 7;

        System.out.println((double) x / y);
        int c = --x;
        System.out.println(c);//12 -> 11
        System.out.println(x);//11 -> 12
        c = x++ + ++x + ++x + x++; //10+12+13+13
        System.out.println("c: " + c);

        boolean bool = true;
        System.out.println(bool);
        System.out.println(!bool);

        // AND and OR
        int a = 5;
        int b = 8;
        int d = 4;

        System.out.println((a > b) && (a > d) && (b > d));
        if (b >= 8) {
            System.out.println("b >=8");
        }
        if (b == 8) {
            System.out.println("b = 8");

        }
        System.out.println("Next step");
        System.out.println("End");

        boolean isWorkDay = new Random().nextBoolean(); //true or false

        if (isWorkDay) {
            System.out.println("isWorkDay");//if expression is true
        } else {
            System.out.println("is not WorkDay");//if expression is false
        }
        System.out.println("End");

    }
}
