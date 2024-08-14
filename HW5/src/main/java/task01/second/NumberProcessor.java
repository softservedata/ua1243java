package task01.second;

public class NumberProcessor {

    public static int getSumOfFirstFive(int[] numbers) {
        if (numbers.length < 5) {
            throw new IllegalArgumentException("Array must contain at least 5 elements.");
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int getProductOfLastFive(int[] numbers) {
        if (numbers.length < 5) {
            throw new IllegalArgumentException("Array must contain at least 5 elements.");
        }
        int product = 1;
        for (int i = numbers.length - 5; i < numbers.length; i++) {
            product *= numbers[i];
        }
        return product;
    }

    public static boolean areFirstFivePositive(int[] numbers) {
        if (numbers.length < 5) {
            throw new IllegalArgumentException("Array must contain at least 5 elements.");
        }
        for (int i = 0; i < 5; i++) {
            if (numbers[i] <= 0) {
                return false;
            }
        }
        return true;
    }
}
