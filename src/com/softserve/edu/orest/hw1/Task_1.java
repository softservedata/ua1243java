package com.softserve.edu.orest.hw1;
// Write a program that reads three strings and outputs them in the reverse order, each on a new line

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 words");

        String  a = scanner.next();
        String  b = scanner.next();
        String  c = scanner.next();

        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}