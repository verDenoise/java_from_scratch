package prof_module.homeWork_4.task_6;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Set<Integer> one = new HashSet<>();
        one.add(1);
        one.add(3);

        Set<Integer> two = new HashSet<>();
        two.add(2);
        two.add(4);

        Set<Set<Integer>> snakeInt = new HashSet<>();
        snakeInt.add(one);
        snakeInt.add(two);

        Set<Integer> result = snakeInt.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());

        System.out.println(result);
    }
}
