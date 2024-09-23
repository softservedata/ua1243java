package homework.dmytro.livantsov.homeW_05_Arrays_Loops_Task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Input10NumbersAndSum {
    static Scanner scanner = new Scanner(System.in);
    public static void operationOnNumbers() {

        int[] arrayOf10Numbers = new int[10];
        int num = 0;
        int sumOfNumbers = 0;
        boolean isFiveNUmbersCalculated = true;



        int inputNumber;


        System.out.println("\nWrite 10 numbers in your array :");

        while (num < arrayOf10Numbers.length) {
            System.out.println("Сell № " + (num + 1) + " of an array of 10 numbers. ");
            inputNumber = scanner.nextInt();
            arrayOf10Numbers[num] = inputNumber;
            num++;
        }

        System.out.println("\nThis is your numbers in this array: " + Arrays.toString(arrayOf10Numbers));


        for (int i = 0; i < arrayOf10Numbers.length - 5; i++) {
            if (arrayOf10Numbers[i] <= 0) {
                sumOfNumbers = 0;
                isFiveNUmbersCalculated = false;
                break;
            }

            sumOfNumbers += arrayOf10Numbers[i];
        }


        if (!isFiveNUmbersCalculated){
            for (int j = 5; j < arrayOf10Numbers.length; j++){
                sumOfNumbers += arrayOf10Numbers[j];
            }
        }
        System.out.println("\n\nSum of numbers = " + sumOfNumbers);
    }
}
