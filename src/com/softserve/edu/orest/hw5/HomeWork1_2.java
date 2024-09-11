package com.softserve.edu.orest.hw5;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 10 different numbers:");
        int [] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int[] arr1 = {arr[0], arr[1], arr[2], arr[3], arr[4]};
        int[] arr2 = {arr[5], arr[6], arr[7], arr[8], arr[9]};

        if (arr[0] < 0|| arr[1] < 0 || arr[2] < 0 || arr[3] < 0 || arr[4] < 0) {
            System.out.println(sum(arr2));
        }else {
            System.out.println(sum(arr1));
        }




//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        int number3 = scanner.nextInt();
//        int number4 = scanner.nextInt();
//        int number5 = scanner.nextInt();
//        int number6 = scanner.nextInt();
//        int number7 = scanner.nextInt();
//        int number8 = scanner.nextInt();
//        int number9 = scanner.nextInt();
//        int number10 = scanner.nextInt();

//        int[] arr1 = {number1, number2, number3, number4, number5};
//        int[] arr2 = {number6, number7, number8, number9, number10};
//
//        if (number1 < 0|| number2 < 0 || number3 < 0 || number4 < 0 || number5 < 0) {
//            System.out.println(sum(arr2));
//        }else {
//            System.out.println(sum(arr1));
//        }

    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
        return sum;

    }
}
