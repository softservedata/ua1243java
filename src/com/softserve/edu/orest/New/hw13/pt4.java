package com.softserve.edu.orest.New.hw13;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Function;
import java.util.function.Predicate;

public class pt4 {
    public static void main(String[] args) {
        Integer[] elements = new Integer[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(count(elements, i -> i%2 == 0));
        System.out.println(count(elements, i -> i > 6));
    }

    static int count(Integer[] elements, Predicate<Integer> condition) {
        int res = 0;
        for(Integer element : elements) {
            if(condition.test(element)) {
                res++;
            }
        }
        return res;
    }
    
}
