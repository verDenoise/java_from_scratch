package prof_module.homeWork_4.task_4;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream.of(1.1, 2.2, 3.3, 4.4, 5.5)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
