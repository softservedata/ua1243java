package com.softserve.edu.orest.New.hw8;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        int start = 2;
        int end = 99;

        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                try {
                    numbers[i] = readNumber(start, end, scanner);
                    start = numbers[i] + 1;
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }
        System.out.print("Valid sequence:");
        for (var number : numbers) {
            System.out.println(number + " ");
        }
        scanner.close();
    }


    static int readNumber(int start, int end, Scanner scanner) throws Exception {
        System.out.println("Enter the number from the range [" + start + " - " + end + ']');

        int number = 0;
        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new Exception("Not an integer number");
        }


        if (number < start || number > end) {
            throw new Exception("Number " + number + " is out of range [" + start + "..." + end + "]");
        }
        return number;
    }

}
