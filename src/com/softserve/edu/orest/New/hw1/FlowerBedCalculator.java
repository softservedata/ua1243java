package com.softserve.edu.orest.New.hw1;

import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What the radius of the flower bed? ");
        int radius = scanner.nextInt();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("The perimeter of the flower bed is " + perimeter);
        System.out.println("The area of the flower bed is " + area);
    }
}
