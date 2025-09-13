package com.softserve.edu.orest.New.hw3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        int side1 = getSide("Input side 1: ");
        int side2 = getSide("Input side 2: ");
        int side3 = getSide("Input side 3: ");

        double semi = semi(side1, side2, side3);
        double area = area(semi, side1, side2, side3);

        System.out.println("The area of triangle is %.2f%n".formatted(area));
    }

    private static int getSide(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    private static double semi(int side1, int side2, int side3) {
        return (double) (side1 + side2 + side3) / 2;
    }

    private static double area(double semi, int side1, int side2, int side3) {
        return Math.sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));
    }

}
