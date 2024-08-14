package academy.softserve.Homework3.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter third number: ");
        int num3 = scan.nextInt();
        int min = smallestNumber(num1,num2,num3);
        System.out.println("The smallest number is "+ min);

    }

    public static int smallestNumber(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}
