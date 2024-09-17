package com.softserve.HW4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class NumberAnalyzer {
    private int number1;
    private int number2;
    private int number3;

    public NumberAnalyzer(int num1, int num2, int num3) {
        this.number1 = num1;
        this.number2 = num2;
        this.number3 = num3;
    }

    public int findMaximum() {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }

    public int findMinimum() {
        if (number1 < number2 && number1 < number3) {
            return number1;
        } else if (number2 < number1 && number2 < number3) {
            return number2;
        } else {
            return number3;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello! Please write three numbers:");
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        NumberAnalyzer analyzer = new NumberAnalyzer(number1, number2, number3);

        int max = analyzer.findMaximum();
        int min = analyzer.findMinimum();

        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);

        reader.close();
    }
}
