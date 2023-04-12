package base_module.HOME_WORK_1_PART_3;
/*
На вход последовательно подается возрастающая последовательность из n
целых чисел, которая может начинаться с отрицательного числа.
Посчитать и вывести на экран, какое количество отрицательных чисел было
введено в начале последовательности. Помимо этого нужно прекратить
выполнение цикла при получении первого неотрицательного числа на вход.
Ограничения:
0 < n < 1000
-1000 < ai < 1000
Пример:
-55 -42 -19 -15 17 33 --> 4
10 20 --> 0
 */

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (true) {
            int ai = scanner.nextInt();
            if (ai >= 0) {
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
