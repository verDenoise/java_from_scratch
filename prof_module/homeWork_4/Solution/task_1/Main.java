package prof_module.homeWork_4.task_1;

import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {

        System.out.println(IntStream.range(1, 101)
                .filter(x -> x % 2 == 0)
                .reduce(Integer::sum));

    }
}
