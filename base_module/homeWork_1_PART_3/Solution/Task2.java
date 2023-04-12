package base_module.HOME_WORK_1_PART_3;

import java.util.Scanner;

/*
На вход подается два положительных числа m и n. Найти сумму чисел между m
и n включительно.
Ограничения:
0 < m, n < 10
m < n
Пример:
Входные данные Выходные данные
7 9 --> 24
1 2 --> 3
 */
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
