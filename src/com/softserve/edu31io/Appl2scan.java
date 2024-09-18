package com.softserve.edu31io;

import java.util.Scanner;

public class Appl2scan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.print("Input number: ");
        try {
            x = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("I/O Error.");
        }
        System.out.println("Number is " + (x + 1));
        //
        sc.close();
    }
}

