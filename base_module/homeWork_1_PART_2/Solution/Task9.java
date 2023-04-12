package base_module.HOME_WORK_1_PART_2;
/*
 Тригонометрическое тождество
Пока Петя практиковался в работе со строками, к нему подбежала его дочь и спросила: "А правда ли, что тригонометрическое тождество (sin^2(x)+ cos^2(x) - 1 == 0) всегда-всегда выполняется?"

Напишите программу, которая проверяет, что при любом x на входе тригонометрическое тождество будет выполняться (то есть будет выводить true при любом x).

Ограничение:
-1000 < x < 1000
 */

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        System.out.println((int) (Math.sin(x) * Math.sin(x) + Math.cos(x) * Math.cos(x) - 1.0) == 0);
    }
}
