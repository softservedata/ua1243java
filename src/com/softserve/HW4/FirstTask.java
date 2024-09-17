package com.softserve.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Hi! Please write a three number in range of -5 to 5");
        float number1 = Float.parseFloat(reader.readLine());
        float number2 = Float.parseFloat(reader.readLine());
        float number3 = Float.parseFloat(reader.readLine());

        boolean isNumber1InRange = checkNumberInRange(number1);
        boolean isNumber2InRange = checkNumberInRange(number2);
        boolean isNumber3InRange = checkNumberInRange(number3);

        if (isNumber1InRange && isNumber2InRange && isNumber3InRange) {
            System.out.println("Number is in range");
        } else {
            System.out.println("Number out of range");
        }

    }
    private static boolean checkNumberInRange(float number) {
        return number >= -5 && number <= 5;
    }
}
