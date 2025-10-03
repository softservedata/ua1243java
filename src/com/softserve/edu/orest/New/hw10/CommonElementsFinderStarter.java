package com.softserve.edu.orest.New.hw10;

import java.util.ArrayList;
import java.util.List;

class CommonElementsFinderStarter {

    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) {
            return new ArrayList<>();
        }

        List<Integer> common = new ArrayList<>();
        for (int item : list1) {
            if (list2.contains(item)) {
                if (!common.contains(item)) {
                    common.add(item);
                }
            }
        }
        return common;
    }

    public static Integer findMaxValue(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        int max = list.get(0);
        for (int item : list) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 5, 7, 8, 10);
        List<Integer> list2 = List.of(2, 3, 4, 5, 9);

        List<Integer> commonElements = findCommonElements(list1, list2);
        System.out.println("Common elements: " + commonElements);

        Integer maxValue = findMaxValue(commonElements);
        if (maxValue != null) {
            System.out.println("Maximum value among common elements: " + maxValue);
        } else {
            System.out.println("No common elements to determine the maximum value.");
        }
    }
}
