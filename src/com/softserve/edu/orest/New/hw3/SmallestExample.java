package com.softserve.edu.orest.New.hw3;

import java.util.Scanner;

public class SmallestExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = getNumber(scanner, "Input the first number: ");
        int num2 = getNumber(scanner, "Input the second number: ");
        int num3 = getNumber(scanner, "Input the third number: ");

        int small = getSmall(num1, num2, num3);

        System.out.println("The smallest number is " + small);
    }

    public static int getNumber(Scanner scanner, String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }
    public static int getSmall(int num1, int num2, int num3){
        return Math.min(Math.min(num1, num2), num3);
    }
}
