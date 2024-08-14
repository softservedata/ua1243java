package task01.third;

public class NumberAnalyzer {
    public static int getPositionSecondPositive(int [] numbers){
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        int counter = 0;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] > 0){
                counter++;
            }
            if (counter == 2) return i;
        }
        return -1;
    }
    public static int getMinValue(int [] numbers){
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int getMinValuePosition(int[] numbers){
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        int position = 0;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == getMinValue(numbers)){
                position = i;
            }
        }
        return position;
    }
    public static int getProductEvenNumbers(int[] numbers){
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        int product = 1;
        boolean hasEven = false;
        for (int number : numbers) {
            if (number % 2 == 0 && number != 0) {
                product *= number;
                hasEven = true;
            }
        }
        return hasEven ? product : -1;
    }
}
