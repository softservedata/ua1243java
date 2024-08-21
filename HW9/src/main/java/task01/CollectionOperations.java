package task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionOperations {

    public static final int RANDOM_NUMBER = new Random().nextInt(1000);
    private static final int ZERO_NUMBER = 0;

    public static void swapMinAndMax(List<Integer> list) {
        if (list == null || list.size() < 2) {
            System.out.println("List is null or does not have enough elements to swap.");
            return;
        }

        try {
            int minIndex = list.indexOf(Collections.min(list));
            int maxIndex = list.indexOf(Collections.max(list));
            if (minIndex == maxIndex) {
                System.out.println("Min and max are the same. No swap needed.");
                return;
            }
            Collections.swap(list, minIndex, maxIndex);
        } catch (IllegalArgumentException e) {
            System.out.println("Error finding min or max: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error swapping elements: " + e.getMessage());
        }
    }

    public static void insertBeforeNegative(List<Integer> list) {
        if (list == null) {
            System.out.println("List is null.");
            return;
        }

        try {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < 0) {
                    list.add(i, RANDOM_NUMBER);
                    return;
                }
            }
            System.out.println("No negative elements found to insert before.");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error inserting before negative element: " + e.getMessage());
        }
    }

    public static void insertZeroBetween(List<Integer> list) {
        if (list == null || list.size() < 2) {
            System.out.println("List is null or does not have enough elements to insert zero.");
            return;
        }

        try {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) < 0 && list.get(i + 1) >= 0 || (list.get(i) >= 0 && list.get(i + 1) < 0)) {
                    list.add(i + 1, ZERO_NUMBER);
                    i++;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error inserting zero between elements: " + e.getMessage());
        }
    }

    public static List<List<Integer>> splitDirectAndReverse(List<Integer> list, int numberOfElements) {
        if (list == null || numberOfElements < 0 || numberOfElements > list.size()) {
            System.out.println("Invalid list or numberOfElements.");
            return new ArrayList<>();
        }

        try {
            List<Integer> directList = new ArrayList<>(list.subList(0, numberOfElements));
            List<Integer> reverseList = new ArrayList<>(list.subList(numberOfElements, list.size()));
            Collections.reverse(reverseList);

            List<List<Integer>> result = new ArrayList<>();
            result.add(directList);
            result.add(reverseList);
            return result;

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error splitting and reversing list: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void removeLastEven(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("List is null or empty.");
            return;
        }

        try {
            int lastEvenIndex = -1;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) {
                    lastEvenIndex = i;
                }
            }
            if (lastEvenIndex != -1) {
                list.remove(lastEvenIndex);
            } else {
                System.out.println("No even elements found.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error removing last even element: " + e.getMessage());
        }
    }

    public static void removeAfterFirstMin(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("List is null or empty.");
            return;
        }

        try {
            int min = Collections.min(list);
            int minIndex = list.indexOf(min);

            if (minIndex != -1 && minIndex < list.size() - 1) {
                list.remove(minIndex + 1);
            } else if (minIndex == list.size() - 1) {
                System.out.println("The minimum element is the last one. Nothing to remove.");
            } else {
                System.out.println("Minimum element not found.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error finding the minimum element: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error removing element before the minimum: " + e.getMessage());
        }
    }
}
