package base_module.HOME_WORK_1_PART_2;

import java.util.Scanner;

/*
Первый квадрант
Петя пришел домой и помогает дочке решать математику.
Ей нужно определить, принадлежит ли точка с указанными координатами первому квадранту.
Недолго думая, Петя решил автоматизировать процесс и написать программу: на вход нужно принимать два целых числа (координаты точки), выводить true, когда точка попала в квадрант и false иначе.
Но сначала Петя вспомнил, что точка лежит в первом квадранте тогда, когда её координаты удовлетворяют условию: x > 0 и y > 0.
 */
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(x > 0 && y > 0);

    }
}
