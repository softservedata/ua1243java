package com.softserve.edu.orest.New.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {

        String[] array1 = {"One", "Two", "Three", "Four", "Five"};
        System.out.println("original" + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted" + Arrays.toString(array1));

        int[] array2 = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < array2.length; i++) {
            sum += array2[i];
        }

        int avrg = sum / array2.length;
        System.out.println("The average value is " + avrg);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to search: ");
        int input = scan.nextInt();
        boolean found = false;

        for (int i = 0; i < array2.length; i++) {
            if (input == array2[i]) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The number " + input + " is in the list");
        } else {
            System.out.println("The number " + input + " is not in the list");
        }
    }
}
