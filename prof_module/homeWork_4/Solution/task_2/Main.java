package prof_module.homeWork_4.task_2;

import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        System.out.println(
                Stream.of(1, 2, 3, 4, 5)
                        .reduce((sum, x) -> sum * x)
        );
    }
}
