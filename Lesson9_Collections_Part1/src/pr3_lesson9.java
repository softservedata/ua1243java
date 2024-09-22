import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class pr3_lesson9 {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(10);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 integers (separated by space):");
        for (int i = 0; i < 10; i++) {
            myCollection.add(scan.nextInt());
        }

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("Positions of elements greater than 5: " + newCollection);

        myCollection.removeIf(num -> num > 20);
        System.out.println("Collection after removing elements greater than 20: " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        myCollection.add(5, -1);

        System.out.println("Collection after inserting elements: ");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position " + i + " - " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println("Sorted collection: " + myCollection);
    }
}
