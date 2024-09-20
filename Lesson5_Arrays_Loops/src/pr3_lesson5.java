import java.util.Random;

public class pr3_lesson5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        int maxNumber = Integer.MIN_VALUE;
        int sumPositive = 0;
        int countNegative = 0;
        int countPositive = 0;


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(201) - 100;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number > 0) {
                sumPositive += number;
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            }
        }

        System.out.println("The biggest number in the arr: " + maxNumber);
        System.out.println("The sum of positive numbers: " + sumPositive);
        System.out.println("The number of negative numbers: " + countNegative);

        if (countNegative > countPositive) {
            System.out.println("There are more negative values in the array.");
        } else if (countPositive > countNegative) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }
}
