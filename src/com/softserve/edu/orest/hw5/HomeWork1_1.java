package com.softserve.edu.orest.hw5;

import java.util.Scanner;

public class HomeWork1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the month number:");
        int input = scanner.nextInt();
        int monthIndex = input - 1;
        System.out.println("The number of days is " + getMonthDays(monthIndex));
    }

    public static int getMonthDays(int index) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return monthDays[index];
    }
}