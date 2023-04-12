package base_module.HOME_WORK_1_PART_3;
/*
Дана строка s. Вычислить количество символов в ней, не считая пробелов
(необходимо использовать цикл).

Ограничения:
0 < s.length() < 1000

Пример:
Входные данные Выходные данные
Hello world --> 10
Never give up --> 11
 */

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                j--;
            }
        }
        System.out.println(s.length() + j);
    }
}
