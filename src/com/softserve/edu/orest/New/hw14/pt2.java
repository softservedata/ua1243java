package com.softserve.edu.orest.New.hw14;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class pt2 {
    public static void main(String[] args) {

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics statistics = primes.stream()
                .mapToInt(i -> i)
                .summaryStatistics();

        System.out.println("count " + statistics.getCount());
        System.out.println("min " + statistics.getMin());
        System.out.println("man " + statistics.getMax());
        System.out.println("sum " + statistics.getSum());
    }
}
