package com.softserve.edu.orest.hw3;

//Write Java console application with method to calculate the area of a triangle.

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double s1 = scanner.nextDouble();
        double s2 = scanner.nextDouble();
        double s3 = scanner.nextDouble();

        double area = area(s1, s2, s3);

        System.out.println(area);
    }

    public static double semiPer(double a, double b, double c) {
        double sum = a + b + c;
        return sum / 2;
    }

    public static double area(double a, double b, double c) {
        double s = semiPer(a, b, c);

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

}

