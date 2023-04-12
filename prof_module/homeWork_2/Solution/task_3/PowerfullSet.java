package prof_module.homeWork_2.task_3;

import java.util.HashSet;
import java.util.Set;

public class PowerfullSet {

    public <T> Set<T> intersection(Set<T> set1, Set<T> set2) {

        Set<T> ourSet = new HashSet<>(set1);

        ourSet.retainAll(set2);

        return ourSet;
    }

    public <T> Set<T> union(Set<T> set1, Set<T> set2) {

        Set<T> ourSet = new HashSet<>(set1);

        ourSet.addAll(set2);

        return ourSet;
    }

    public <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2) {

        Set<T> ourSet = new HashSet<>(set1);

        ourSet.removeAll(set2);

        return ourSet;
    }

}
