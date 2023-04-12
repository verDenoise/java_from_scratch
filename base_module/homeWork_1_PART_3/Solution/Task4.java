package base_module.HOME_WORK_1_PART_3;

import java.util.Scanner;

/*
Дано натуральное число n. Вывести его цифры в “столбик”.
Ограничения:
0 < n < 1000000
Пример:
Входные данные Выходные данные
74 -->
 7
 4

1630 -->
 1
 6
 3
 0
 */
public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int m = n;
        int i = 0;
        while (m > 9) {
            m = m / 10;
            i++;
        }
        for (int j = (int) Math.pow(10, i); j > 0; j = j / 10) {
            System.out.println(n / j);
            n = n % j;
        }
    }
}




