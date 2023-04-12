package base_module.HOME_WORK_1_PART_2;
/*
Разделение строки 2
Раз так легко получается разделять по первому пробелу, Петя решил немного изменить предыдущую программу и теперь разделять строку по последнему пробелу.

Ограничение:
В строке гарантированно есть хотя бы один пробел
Первый и последний символ строки гарантированно не пробел
2 < s.length() < 100
 */

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(s.substring(0, s.lastIndexOf(" ")));
        System.out.println(s.substring(s.lastIndexOf(" ") + 1));
    }
}
