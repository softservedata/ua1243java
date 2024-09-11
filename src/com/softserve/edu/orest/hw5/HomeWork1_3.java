package com.softserve.edu.orest.hw5;

import java.util.Scanner;

public class HomeWork1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int minValue = arr[0];
        int minIndex = 0;

        int p = 1;

        int secondPositive = -1;
        boolean seenPositive = false;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                p = p * arr[i];
            }
            if (arr[i] > 0) {
                if (seenPositive == true && secondPositive == -1) {
                    secondPositive = i;
                } else {
                    seenPositive = true;
                }
            }
        }
        System.out.println("The minimum value is " + minValue + ", index is " + minIndex);
        System.out.println("The product of even numbers is " + p);
        System.out.println("The position of second positive number is " + secondPositive);
    }
}