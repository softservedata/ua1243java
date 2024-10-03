package academy.softserve.Homework9.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ManagerList {

    private ArrayList<Integer> myCollection;
    private Random random;

    public ManagerList() {
        myCollection = new ArrayList<>();
        random = new Random();
    }

    public ArrayList<Integer> getMyCollection() {
        return myCollection;
    }

    public void addNumber(int number) {
        myCollection.add(number);
    }

    public void swapMinWithMax() {
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        Collections.swap(myCollection, minIndex, maxIndex);
    }

    // method insert random three digital number after first negative number
    public void insertRandomThreeDigitalNumber() {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i + 1, random.nextInt(1000));
                break;
            }
        }
    }

    /*method insert zero between all
    neighboring elements collection myCollection
    with different signs
     */
    public void insertZero() {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
    }

    /* method which copy the first k elements of  the myCollection
     to the list1, in direct order, and the rest to the
     list2 in reverse order */
    public void copyToList(int k) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < k && i <= myCollection.size(); i++) {
            list1.add(myCollection.get(i));
        }
        for (int i = myCollection.size() - 1; i > k && i >= 0; i--) {
            list2.add(myCollection.get(i));
        }
        System.out.println("List1 " + list1);
        System.out.println("List2 " + list2);
    }

    public void removeLastEvenElement() {
        boolean hasEvenElement = false;
        for (int i = myCollection.size() - 1; i > 0; i--) {
            if (myCollection.get(i) % 2 == 0 && myCollection.get(i) != 0) {
                myCollection.remove(i);
                hasEvenElement = true;
                break;
            }
        }
        if (!hasEvenElement) {
            System.out.println("There are not any even elements in collection.");
        }
    }

    // method remove the  element following the first minimum
    public void removeElement() {
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        if (minIndex >= 0 && minIndex < myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
        } else {
            System.out.println("Min is the last");
        }
    }
}
