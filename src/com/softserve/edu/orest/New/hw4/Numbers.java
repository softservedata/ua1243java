package com.softserve.edu.orest.New.hw4;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        int num1 = getNum("Enter first number:");
        int num2 = getNum("Enter second number:");
        int num3 = getNum("Enter third number:");

        int count = 0;
        if ((num1 & 2) != 0) {
            count++;
        }
        if ((num2 & 2) != 0) {
            count++;
        }
        if ((num3 & 2) != 0) {
            count++;
        }
        System.out.println("You have " + count + " odd numbers");
    }

    static int getNum(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }
}
