package com.softserve.edu07calc;

import java.util.Scanner;

public class AppCalc {

    public static void main(String[] args) {
        /* Testability Error
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        double res = a + b;
        System.out.println("a + b = " + res);
        */
        //
        //
        Calc calc = new Calc();
        System.out.println("5 + 5 = " + calc.add(5, 5));
        System.out.println("20 / 5 = " + calc.div(20, 5));
    }
}
