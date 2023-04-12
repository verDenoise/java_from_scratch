package prof_module.homeWork_4.task_3;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println(
                Stream.of("abc", "", "", "def", "qqq")
                        .filter(x -> !x.equals(""))
                        .count()
        );

    }
}
