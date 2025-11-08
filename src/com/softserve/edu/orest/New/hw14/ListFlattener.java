package com.softserve.edu.orest.New.hw14;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ListFlattener {
    public static List<Integer> flatten(List<List<Integer>> nestedList) {

        if (nestedList == null) {
            return Collections.emptyList();
        }

        return nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

}
