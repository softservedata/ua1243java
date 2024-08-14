package task01.second;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(-10,100);
        }
        System.out.println(Arrays.toString(array));
        if(NumberProcessor.areFirstFivePositive(array)){
            System.out.println("The first five numbers are positive");
            System.out.println("Their sum: " + NumberProcessor.getSumOfFirstFive(array));
        } else {
            System.out.println("The first five numbers are not positive");
            System.out.println("The product of the last five: " + NumberProcessor.getProductOfLastFive(array));
        }
    }
}
