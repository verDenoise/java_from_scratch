package base_module.HOME_WORK_1_PART_3;
/*
На вход подается: целое число n,
целое число p
целые числа a1, a2 , … an

Необходимо вычислить сумму всех чисел a1, a2, a3 … an которые строго
больше p.

Ограничения:
0 < m, n, ai < 1000

Пример:
2
18
95 31
-->
126
-----------------------
6
29
40 37 97 72 80 18
-->
326
-----------------------
1
100
42
-->
0
 */

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int sum = 0;
        while (n != 0) {
            int an = scanner.nextInt();
            if (an > p) {
                sum += an;
            }
            n--;
        }
        System.out.println(sum);
    }
}
