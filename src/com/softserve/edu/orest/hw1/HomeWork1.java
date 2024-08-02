package com.softserve.edu.orest.hw1;

import java.util.Scanner;

//Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius
//from the console, and output obtained results
public class HomeWork1 {
    public static void main(String[] args) {

        double pi = Math.PI;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the radius");

        int r = scanner.nextInt();

        double c = 2 * pi * r;
        double a = pi * (r * r);

        System.out.println("Perimeter of the circle " + c);
        System.out.println("Area of circle " + a);

    }
}
