package com.softserve.edu06alg;

import java.util.Arrays;

public class AppAlgor {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    var t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, -5, 7, -4, 8};
        //
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
        //
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                product = product * arr[i];
            }
        }
        System.out.println("Product = " + product);
        //
        int amount = 0;
        for (int a : arr) {
            if (a > 0 && a <= 7) {
                amount++;
            }
        }
        System.out.println("Amount = " + amount);
        System.out.println("(arr[0] + arr[1]) = " + (arr[0] + arr[1]));
        //
        int max = arr[0];
        int imax = 0;
        //
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");
        //
        System.out.println("Original Array = " + Arrays.toString(arr));
        //sort(arr);
        Arrays.sort(arr);
        System.out.println("Sorted Array = " + Arrays.toString(arr));
        //
        int index = Arrays.binarySearch(arr, 7);
        System.out.println("Position of element with value 7 is " + index);
    }
}
