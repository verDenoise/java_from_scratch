package base_module.HOME_WORK_1_PART_2;
/*
Логарифмическое тождество
"А логарифмическое?" - не унималась дочь.

Ограничение:
-500 < n < 500
 */

import java.util.Scanner;

public class HomeWork_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();

        System.out.println((Math.log(Math.pow(Math.E, n))) == n);
    }
}
