package HW9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MyCollectionOperations {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(201) - 100);
        }

        System.out.println("Initial Collection: " + myCollection);

        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));

        Collections.swap(myCollection, maxIndex, minIndex);
        System.out.println("After swapping max and min: " + myCollection);

        int randomThreeDigit = random.nextInt(900) + 100;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, randomThreeDigit);
                break;
            }
        }
        System.out.println("After inserting 3-digit number before first negative: " + myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) >= 0 && myCollection.get(i + 1) < 0) ||
                    (myCollection.get(i) < 0 && myCollection.get(i + 1) >= 0)) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("After inserting zeroes between different signs: " + myCollection);
        System.out.print("Enter value of k from 1 to 10: ");
        int k = sc.nextInt();

        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);

        System.out.println("List1 (first k elements): " + list1);
        System.out.println("List2 (rest elements in reverse order): " + list2);

        boolean removedEven = false;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                removedEven = true;
                break;
            }
        }
        if (!removedEven) {
            System.out.println("No even element found");
        } else {
            System.out.println("After removing the last even element: " + myCollection);
        }

        int firstMinIndex = myCollection.indexOf(Collections.min(myCollection));
        if (firstMinIndex != myCollection.size() - 1) {
            myCollection.remove(firstMinIndex + 1);
        }
        System.out.println("After removing the element after the first minimum: " + myCollection);
    }
}
