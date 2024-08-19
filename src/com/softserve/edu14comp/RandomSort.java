package com.softserve.edu14comp;

import java.util.Arrays;
import java.util.Random;

public class RandomSort {
    public static void main(String[] args) {
        int[] x = new int[10];
        Random rand = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextInt(10);
        }
        System.out.println(" Original: " + Arrays.toString(x));
        Arrays.sort(x);
        System.out.print(" Sorted: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
