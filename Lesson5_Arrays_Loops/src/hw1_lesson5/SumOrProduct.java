package hw1_lesson5;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 integer numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scan.nextInt();
        }

        int sum = 0;
        boolean allPositive = true;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
            } else {
                allPositive = false;
                break;
            }
        }

        if (allPositive) {
            System.out.println("Sum of the first five positive numbers: " + sum);
        } else {
            int product = 1;
            for (int i = 5; i < 10; i++) {
                product *= numbers[i];
            }
            System.out.println("Product of the last five numbers: " + product);
        }
        scan.close();
    }
}
