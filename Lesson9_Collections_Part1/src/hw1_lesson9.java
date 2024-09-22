import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class hw1_lesson9 {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(10);
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter 10 integers (or press Enter for random numbers):");
        for (int i = 0; i < 10; i++) {
            if (scan.hasNextInt()) {
                myCollection.add(scan.nextInt());
            } else {
                myCollection.add(random.nextInt(201) - 100);
            }
        }

        System.out.println("Initial Collection: " + myCollection);

        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        Collections.swap(myCollection, minIndex, maxIndex);
        System.out.println("After swapping min and max: " + myCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, random.nextInt(900) + 100);
                break;
            }
        }
        System.out.println("After inserting a random three-digit number: " + myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("After inserting zeros between different signs: " + myCollection);

        int k = 5;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);

        System.out.println("List1 (first " + k + " elements): " + list1);
        System.out.println("List2 (remaining elements in reverse): " + list2);

        int lastEvenIndex = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenIndex = i;
            }
        }
        if (lastEvenIndex != -1) {
            myCollection.remove(lastEvenIndex);
            System.out.println("After removing the last even element: " + myCollection);
        } else {
            System.out.println("No even elements to remove.");
        }

        int firstMinIndex = myCollection.indexOf(Collections.min(myCollection));
        if (firstMinIndex < myCollection.size() - 1) {
            myCollection.remove(firstMinIndex + 1);
            System.out.println("After removing the element following the first minimum: " + myCollection);
        }
    }
}
