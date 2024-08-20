package com.softserve.finder;

import java.util.Scanner;

public class Finder {
    public static final Scanner SCANNER=new Scanner(System.in);
    public static void main(String[] args) {
        double[] arr = new double[5];
        System.out.println("Enter the 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = SCANNER.nextDouble();
            //reading array elements from the user
        }

        System.out.println("The min value is: "+min(arr) + "and position of this value is: "+getMinPosition(arr));
        System.out.println("The product of even numbers: " + findProduct(arr));


    }

    public static double min(double [] arr) {
        double min = arr[0];
        int iMin = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
                iMin = i;
            }
            i++;

        }
        return min;

    }

    public static int getMinPosition(double [] arr) {
        double min = arr[0];
        int iMin = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
                iMin = i;
            }
            i++;

        }
        return iMin;

    }
    static double findProduct(double[] arr){
double product = 1;
boolean hasEven = false;
        for (int i = 0; i < 5; i++) {

            if (arr[i] % 2 == 0) {
                product = product * arr[i];
                hasEven = true;
            }
        }
        if (!hasEven){
            return 0;
        }
return product;
    }





}

