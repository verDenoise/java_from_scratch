package prof_module.homeWork_4.task_5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println(
                Stream.of("abc", "def", "qqq")
                        .map(String::toUpperCase)
                        .collect(Collectors.joining(", "))
        );
    }
}
