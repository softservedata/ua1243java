package com.softserve.edu.orest.hw3;

//Write Java console application with method to find the smallest number among three integer numbers

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println("Enter 3 numbers:");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        System.out.println("The minimum number is " + min(n1,n2,n3));
    }

    public static int min(int n1, int n2, int n3) {

        int min1 = Math.min(n1, n2);
        int min = Math.min(min1,n3);
        return min;
    }
}

