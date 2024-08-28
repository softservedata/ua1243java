package com.softserve.edu.orest.hw4;

import java.util.Scanner;
// Write a program that prompts the user to input three float numbers
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        if (rangeCheck(a, b, c)) {
            System.out.println("Your numbers belong to the range [-5, 5]");
        }else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }

    public static boolean rangeCheck(float a, float b, float c) {
        if ((a >= -5 && a <= 5) && (b >= -5 && b <= 5) && (c >= -5 && c <= 5)) {
            return true;
        } else {
            return false;
        }
    }

}