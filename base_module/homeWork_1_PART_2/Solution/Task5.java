package base_module.HOME_WORK_1_PART_2;
/*
 Квадратичное уравнение
Дома дочери Пети опять нужна помощь с математикой!
В этот раз ей нужно проверить, имеет ли предложенное квадратное уравнение решение или нет.

На вход подаются три числа — коэффициенты квадратного уравнения a, b, c.
Нужно вывести "Решение есть", если оно есть и "Решения нет", если нет.
 */

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((b * b - 4 * a * c) >= 0 && a != 0) {
            System.out.println("Решение есть");
        } else {
            System.out.println("Решения нет");
        }
    }
}
