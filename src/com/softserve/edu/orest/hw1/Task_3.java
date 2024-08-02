package com.softserve.edu.orest.hw1;

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
