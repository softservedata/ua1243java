package com.softserve.edu.orest.hw9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myCollection = new ArrayList<>();
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number " + (i + 1));
            myCollection.add(scanner.nextInt());
        }

        System.out.println("Collection: " + myCollection);

        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, maxIndex, minIndex);

        System.out.println("After swapping max and min: " + myCollection);

        Random random = new Random();
        int randomThreeDigit = random.nextInt(999);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, randomThreeDigit);
                break;
            }
        }
        System.out.println("After inserting three-digit number: " + myCollection);

        int k = 3;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new LinkedList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);

        System.out.println("List1 (Direct order): " + list1);
        System.out.println("List2 (Reverse order): " + list2);

        boolean foundEven = false;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                foundEven = true;
                break;
            }
        }
        if (!foundEven) {
            System.out.println("No even found.");
        } else {
            System.out.println("After removing last even element: " + myCollection);
        }

        int firstMin = myCollection.indexOf(Collections.min(myCollection));
        if (firstMin < myCollection.size() - 1) {
            myCollection.remove(firstMin + 1);
        }
        System.out.println("After removing element after the first minimum: " + myCollection);
    }
}
