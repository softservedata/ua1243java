package com.softserve.edu.orest.hw1;

//Create Console Application project in Java.
//In main() method write code for solving next tasks:
//1) 1. Define integer variables a and b. Read values a and b from Console and calculate:
//• a + b
//• a - b
//• a * b
//• a / b.
//Output obtained results.

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);
        System.out.println("Enter 2 digits");

        int a = calc.nextInt();
        int b = calc.nextInt();

        double a1 = a;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        double f = a1 / b;

        System.out.println("a+b= " + c);
        System.out.println("a-b= " + d);
        System.out.println("a*b=" + e);
        System.out.println("a/b=" + f);


    }
}
