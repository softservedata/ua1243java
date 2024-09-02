package academy.softserve.Homework4.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] numbers = new float[3];
        boolean isNumbersWithin = true;
        for (int i = 0; numbers.length > i; i++) {
            System.out.println("Enter \'" + (i + 1) + "\' float number: ");
            numbers[i] = scan.nextFloat();
        }
        for (int i = 0; numbers.length > i; i++) {
            if (numbers[i] >= 5 || numbers[i] <= -5) {
                isNumbersWithin = false;
                break;
            }
        }
        if (isNumbersWithin) {
            System.out.println("all numbers belong to the range [-5, 5]");
        } else {
            System.out.println("not all numbers belong to the range [-5, 5]");
        }
    }
}
