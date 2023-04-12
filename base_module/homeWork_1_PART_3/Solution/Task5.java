package base_module.HOME_WORK_1_PART_3;

import java.util.Scanner;

/*
Даны положительные натуральные числа m и n. Найти остаток от деления m на
n, не выполняя операцию взятия остатка.
Ограничения:
0 < m, n < 10
Пример:
9 1 --> 0
8 3 --> 2
7 9 --> 7
 */
public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int res = 0;
        for (int m = scanner.nextInt(), n = scanner.nextInt(); m >= 0; m = m - n) {
            res = m;
        }
        System.out.println(res);
    }
}
