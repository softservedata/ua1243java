package homework.dmytro.livantsov.homeW_04_ConditionStatement;

import java.util.Scanner;

public class MaxAndMin_Int_Val_02 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num1 = 0, num2 = 0, num3 = 0;
//
//
//        System.out.println("Write three numbers: ");
//        num1 = scanner.nextInt();
//        num2 = scanner.nextInt();
//        num3 = scanner.nextInt();
//
//        System.out.println("Max number is " + maxNumber(num1, num2, num3));
//        System.out.println("Min number is " + minNumber(num1, num2, num3));

        // Close scanner to prevent resource leaks
      //  scanner.close();

//можна зробите мінімально покращення таким чином

        System.out.println("Write three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();


        System.out.println("Max number is " + maxNumber(num1, num2, num3));
        System.out.println("Min number is " + minNumber(num1, num2, num3));
    }

    public static int maxNumber(int num1, int num2, int num3){

        int maxNumber = num1;

        if (num2 >= maxNumber) {
            maxNumber = num2;
        }

        if (num3 >= maxNumber){
            maxNumber = num3;
        }

        return maxNumber;

    }

    public static int minNumber(int num1, int num2, int num3){
        int minNumber = num1;

        if (minNumber >= num2) {
            minNumber = num2;
        }

        if (minNumber >= num3){
            minNumber = num3;
        }
        return minNumber;
    }
}
//Good job.
// You can also add a method that checks if all three values are different,
// and then perform the search for the maximum and minimum values.
