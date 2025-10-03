package com.softserve.edu.orest.New.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class pt3 {
    public static void main(String[] args) {
        List<Integer> myCollection = new Random().ints(10, -10, 30).boxed().collect(Collectors.toList());
        System.out.println(myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);

//        myCollection.removeIf(x -> x > 20);

        var it = myCollection.iterator();
        while (it.hasNext()) {
            if (it.next() > 20) {
                it.remove();
            }
        }

//        for (int i = 0; i < myCollection.size(); i++) {
//            if (myCollection.get(i) > 20) {
//                myCollection.remove(i);
//                i--;
//            }
//        }

        System.out.println(myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position – " + i + " , value of element – " + myCollection.get(i));
        }

        myCollection.sort(null);
        System.out.println(myCollection);

    }
}
