package base_module.HOME_WORK_1_PART_3;

import java.util.Scanner;

/*
На вход подается два положительных числа m и n. Необходимо вычислить m^1
+ m^2 + ... + m^n
Ограничения:
0 < m, n < 10
Пример:
Входные данные Выходные данные
1 1 --> 1
8 5 --> 37448
 */
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int sequence = 0;
        for (int i = 1; i <= n; i++) {
            sequence += (int) Math.pow(m, i);
        }
        System.out.println(sequence);
    }
}
