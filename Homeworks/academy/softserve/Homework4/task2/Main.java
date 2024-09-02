package academy.softserve.Homework4.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; numbers.length > i; i++) {
            System.out.println("Enter \'" + (i + 1) + "\' number: ");
            numbers[i] = scan.nextInt();
        }
        int highestNumber = numbers[0];
        for (int i = 0; numbers.length > i; i++) {
            if (numbers[i] > highestNumber) {
                highestNumber = numbers[i];
            }
        }
        System.out.println("The highest number is: " + highestNumber);
    }
}
