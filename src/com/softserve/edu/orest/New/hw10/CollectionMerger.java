package com.softserve.edu.orest.New.hw10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CollectionMerger {
    public static List<String> mergeAndSortLists(List<String> list1, List<String> list2) {

        List<String> safeList1 = (list1 == null) ? Collections.emptyList() : list1;
        List<String> safeList2 = (list2 == null) ? Collections.emptyList() : list2;

        List<String> combined = new ArrayList<>(safeList1);
        combined.addAll(safeList2);

        List<String> res = new ArrayList<>();
        for (String item : combined) {
            if (!res.contains(item)) {
                res.add(item);
            }
        }

        Collections.sort(res);
        return res;
    }
}