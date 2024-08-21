package task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionOperationsApp {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(-1000,1000));
        }
        System.out.println("Stated list: " + list);

        CollectionOperations.swapMinAndMax(list);
        System.out.println("List after swap min and max: " + list);

        CollectionOperations.insertBeforeNegative(list);
        System.out.println("List after insert before first negative: " + list);

        CollectionOperations.insertZeroBetween(list);
        System.out.println("List after insert zero between all neighboring elements with different signs: " + list);

        List<List<Integer>> resultList = CollectionOperations.splitDirectAndReverse(list,5);
        System.out.println("Direct and reverse lists after split " + resultList);

        CollectionOperations.removeLastEven(list);
        System.out.println("List after remove last even element: " + list);

        CollectionOperations.removeAfterFirstMin(list);
        System.out.println("List after remove element after first min: " + list);
    }
}
