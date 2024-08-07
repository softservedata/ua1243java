package com.softserve.edu05arr;

import java.util.Arrays;

public class AppArr {
    public static void main(String[] args) {
        /*
        int max = 4;
        int[] arr = new int[max];
        arr[0] = 5;
        arr[1] = 8;
        arr[2] = 1;
        arr[3] = 4;
        */
        //
        int[] arr = {5, 8, 1, 4};
        /*
        System.out.print("Array = [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println(" ]");
        */
        System.out.println("Array = " + Arrays.toString(arr));
        /*
        int[][] mas = {     {0, 1, 2, 3},
                            {4, 5, 6, 7},
                            {8, 9, 10, 11},
                            {12, 13, 14, 15}
        };
        */
        int[][] mas = { {3},
                        {4, 5, 6},
                        {8},
                        {12, 13}
        };
        //
        System.out.println("Array:");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(" " + mas[i][j]);
            }
            System.out.println();
        }
        //
        for (int i = 0; i < mas.length; i++) {
            System.out.println("row = " + Arrays.toString(mas[i]));
        }
        //System.out.println("row = " + Arrays.toString(mas)); // print addresses
    }
}
