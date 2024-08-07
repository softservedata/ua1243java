package com.softserve.edu05arr;

public class AppCykl {
    public static void main(String[] args) {
        /*
        int number = 1;
        while (number <= 5) {
            System.out.print(number + " ");
            number++;
        }
        */
        /*
        int i = 10;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 5);
        */
        /*
//        for (int i = 0; i < 5; i++) {
//            System.out.print(i + " ");
//        }
//        for (int i = 0; i < 5; System.out.print(i + " "), i++);
        //
        int i = 0;
        for (; i < 5; ) {
            System.out.print(i + " ");
            i++;
        }
        */
        //
        int[] numbers = {5, 6, 8, 3, 5, 7, 9};
//        for(int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
        for (int current : numbers) {
            // current = numbers[i];
            System.out.print(current + " ");
        }
        //
        //
        System.out.println("\ndone");
    }
}
