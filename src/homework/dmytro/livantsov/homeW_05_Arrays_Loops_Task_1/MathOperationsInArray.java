package homework.dmytro.livantsov.homeW_05_Arrays_Loops_Task_1;

import java.util.Arrays;
import java.util.Scanner;

public class MathOperationsInArray {
    static Scanner scanner = new Scanner(System.in);
    public static void operationsInArray() {
        int[] arr = new int[5];
        int inputNumber = 0, firstPositiveNum = 0, cellOfSecondPositiveNum = 0;
        int minNumCell = 0, minNumInArr = 0;
        int resultOfEvenNum = 0;

        boolean positiveNumActivated = false;



        System.out.println("Add 5 numbers to your array.");
        for (int i = 0; i < arr.length; i++) {
            inputNumber = scanner.nextInt();
            arr[i] = inputNumber;

        }

        System.out.println("\nNumbers in your array " + Arrays.toString(arr));

        for (int num = 0; num < arr.length; num++) {
            if (arr[num] > 0 && !positiveNumActivated) {
                positiveNumActivated = true;
                firstPositiveNum = num;
            }

            if (positiveNumActivated && num > firstPositiveNum && arr[num] > 0) {
                cellOfSecondPositiveNum = num + 1;
                break;
            }
        }

        System.out.println("Second positive number in cell № " + cellOfSecondPositiveNum + ".");


        //
        minNumInArr = arr[0];//Similarly, minNumInArr should be initialized with Integer.MAX_VALUE for a more robust minimum calculation.
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] <= minNumInArr) {
                minNumInArr = arr[k];
                minNumCell = k + 1;
            }
        }

        System.out.println("\nMin number in arr = " + minNumInArr + " and his cell is " + minNumCell + ".");


        for (int even : arr) {
            if (even % 2 == 0 && even != 0) {
                resultOfEvenNum *= even;
            }
        }

        System.out.println("\n\tSum of even numbers is " + resultOfEvenNum + ".");
    }
}
//The logic for finding the second positive number could be simplified
// and combined with the first loop to avoid iterating over the array multiple times.
// Similarly, the minimum number check and even number multiplication could be done in the same loop,
// which would improve performance slightly.