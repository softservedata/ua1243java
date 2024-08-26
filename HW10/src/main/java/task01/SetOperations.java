package task01;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static <T> Set<T> union (Set<T> setFirst, Set<T> setSecond){
        Set<T> union = new HashSet<>(setFirst);
        union.addAll(setSecond);
        return union;
    }

    public static <T> Set<T> intersect (Set<T> setFirst, Set<T> setSecond) {
        Set<T> intersect = new HashSet<>(setFirst);
        intersect.retainAll(setSecond);
        return intersect;
    }

}
