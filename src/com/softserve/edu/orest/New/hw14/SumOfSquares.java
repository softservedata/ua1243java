package com.softserve.edu.orest.New.hw14;

import java.util.List;

public class SumOfSquares {
    public static int calculate(List<Integer> numbers) {

        if(numbers == null) {
            return 0;
        }

        return numbers.stream()
                .mapToInt(n -> n*n)
                .sum();
    }
}
