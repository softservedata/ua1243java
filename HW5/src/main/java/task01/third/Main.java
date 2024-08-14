package task01.third;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = new Random().nextInt(-10,100);
        }
        System.out.println(Arrays.toString(numbers));
        try {
            int secondPositivePosition = NumberAnalyzer.getPositionSecondPositive(numbers);
            System.out.println("Position of second positive number: " + secondPositivePosition);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        int minValue = NumberAnalyzer.getMinValue(numbers);
        int minPosition = NumberAnalyzer.getMinValuePosition(numbers);
        System.out.println("Minimum value: " + minValue + ", Position: " + minPosition);

        try {
            int productOfEvenNumbers = NumberAnalyzer.getProductEvenNumbers(numbers);
            System.out.println("Product of all even numbers (excluding zero): " + productOfEvenNumbers);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
