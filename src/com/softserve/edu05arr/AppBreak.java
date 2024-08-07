package com.softserve.edu05arr;

import java.util.Scanner;

public class AppBreak {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        int n = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("\nInput number = ");
            n = sc.nextInt();
            if (n < 0){
                //break;
                continue;
            }
            System.out.printf("\t\tn = " + n);
        }
        sc.close();
        System.out.printf("\n done");
    }
}
