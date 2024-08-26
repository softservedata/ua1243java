package task01;

import java.util.HashSet;
import java.util.Set;

public class SetOperationsApp {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<Integer> unionSet = SetOperations.union(set1, set2);
        System.out.println("Union of set1 and set2: " + unionSet);

        Set<Integer> intersectSet = SetOperations.intersect(set1, set2);

        System.out.println("Intersection of set1 and set2 (after retainAll): " + intersectSet);
    }
}
