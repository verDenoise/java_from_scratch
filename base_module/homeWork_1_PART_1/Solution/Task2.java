package base_module.HOME_WORK_1_PART_1;
/*
Зачтено: 100 / 100 баллов
На вход подается два целых числа a и b.
Вычислите и выведите среднее квадратическое a и b.
 */

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2.0));
    }
}
