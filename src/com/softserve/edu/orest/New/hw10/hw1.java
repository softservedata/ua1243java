package com.softserve.edu.orest.New.hw10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class hw1 {
    public static void main(String[] args) {
        List<Integer> myCollection = new Random().ints(10, -10, 30).boxed().collect(Collectors.toList());
        System.out.println(myCollection);

        int max = 0;
        int maxIndex = myCollection.get(0);
        for (int i = 0; i < myCollection.size(); i++) {
            if (max < myCollection.get(i)) {
                max = myCollection.get(i);
                maxIndex = i;
            }
        }
        System.out.println("max = " + max);

        int min = 0;
        int minIndex = myCollection.get(0);
        for (int i = 0; i < myCollection.size(); i++) {
            if (min > myCollection.get(i)) {
                min = myCollection.get(i);
                minIndex = i;
            }
        }
        System.out.println("min = " + min);

        myCollection.set(minIndex, max);
        myCollection.set(maxIndex, min);
        System.out.println(myCollection);
        System.out.println("-----------------------------------------------------------------------");

        Random random = new Random();
        int randomNumber = random.nextInt(900) + 100;
        System.out.println("random number = " + randomNumber);

        int firstNegIndex = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                firstNegIndex = i;
                break;
            }
        }
        myCollection.add(firstNegIndex, randomNumber);
        System.out.println(myCollection);
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < myCollection.size() - 1; i++) {
            int current = myCollection.get(i);
            int next = myCollection.get(i + 1);

            boolean difference = (current < 0 && next > 0 || current > 0 && next < 0);

            if (difference) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println(myCollection);
        System.out.println("-----------------------------------------------------------------------");

        List<Integer> list1 = new ArrayList<>(myCollection);
        List<Integer> list2 = new ArrayList<>(myCollection);

        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        System.out.println("list1 = " + list1);

        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(o1, o2);
            }
        });
        System.out.println("list2 = " + list2);
        System.out.println("-----------------------------------------------------------------------");

        boolean foundAndRemoved = false;

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            int current = myCollection.get(i);

            if (current % 2 == 0) {
                myCollection.remove(i);
                System.out.println("The last even element [" + current + " ] was removed");
                foundAndRemoved = true;
                break;
            }
        }
        if (!foundAndRemoved) {
            System.out.println("There is no element to remove");
        }

        System.out.println(myCollection);
        System.out.println("-----------------------------------------------------------------------");

        int minVal = myCollection.get(0);
        int firstMinIndex = 0;

        for (int i = 1; i < myCollection.size(); i++) {

            if (myCollection.get(i) < minVal) {
                minVal = myCollection.get(i);
                firstMinIndex = i;
            }
        }
        if (firstMinIndex < myCollection.size() -1) {
            myCollection.remove(firstMinIndex + 1);
        }

        System.out.println(myCollection);
    }
}
