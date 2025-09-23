package com.softserve.edu.orest.New.hw5;

public class MaxElementFinder {
    public static void main(String[] args) {

        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int maxElement = findMaxElement(array);
        System.out.println("The maximum element in the array: " + maxElement);
    }
    public static int findMaxElement(int[] array) {

        int maxElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }
}