package homework.dmytro.livantsov.homeW_04_ConditionStatement;

import java.util.Scanner;

public class RangeOfNumbers_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float[] arrayOfNumbers = new float[3]; // array for storing 3 numbers
        boolean rangeIsTrue = true; // variable for checking numbers


        // Adding numbers to an array via console
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println("Enter a number in the cell " + (i+1));
            arrayOfNumbers[i] = scanner.nextFloat();
        }


        /*
        In this cycle I check if numbers correct in array, and they belong to the range from -5 to 5;
            If array contain number out of the range, we will get message about it,
                and the variable 'rangeIsTrue' become 'False' which means
                    that the following If condition will not work and cycle is break.
        * */
        for (float arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber > 5 || arrayOfNumber < -5) {
                System.out.println("Not all numbers belong to the range [-5, 5]");
                rangeIsTrue = false;
                break;
            }
        }

        //  If variable still 'True' - we will get next message.
        if (rangeIsTrue){
            System.out.println("Numbers belong to the range [-5, 5]");
        }
    }
}
//Your code works correctly, great job! Here's a possible improvement:
// Instead of hardcoding the numbers 5 and -5, it would be better to use constants for the range,
// which will make future modifications easier.