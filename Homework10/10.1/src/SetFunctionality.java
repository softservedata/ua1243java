import java.util.HashSet;
import java.util.Set;

public class SetFunctionality {
    public static <T> Set<T> union (Set<T> s1, Set<T> s2){
        Set<T> union = new HashSet<>(s1);
        union.addAll(s2);
        return union;
    }

    public static <T> Set<T> intersect (Set<T> s1, Set<T> s2) {
        Set<T> intersect = new HashSet<>(s1);
        intersect.retainAll(s2);
        return intersect;
    }

}
