package com.softserve.edu.orest.hw4;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        System.out.println("Maximum number is " + checkMax(a, b, c));
        System.out.println("Minimum number is " + checkMin(a, b, c));
    }

    public static int checkMax(int a, int b, int c) {
        if ((a > b) && (a > c)) {
            return a;
        }
        if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static int checkMin(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            return a;
        }
        if (b < c) {
            return b;
        } else {
            return c;
        }
    }
}
