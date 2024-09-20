package hw1_lesson5;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 integer numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scan.nextInt();
        }

        int positiveCount = 0;
        int secondPositiveIndex = -1;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    secondPositiveIndex = i;
                    break;
                }
            }
        }
        System.out.println("Position of second positive number: " + (secondPositiveIndex == -1 ? "Not found" : secondPositiveIndex));

        int minValue = numbers[0];
        int minIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("Minimum value: " + minValue + " at position: " + minIndex);

        int product = 1;
        boolean hasEven = false;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] != 0 && numbers[i] % 2 == 0) {
                product *= numbers[i];
                hasEven = true;
            }
        }
        System.out.println("Product of all even numbers (excluding 0): " + (hasEven ? product : "No even numbers"));

        scan.close();
    }
}
