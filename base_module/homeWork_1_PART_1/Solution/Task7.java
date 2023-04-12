package base_module.HOME_WORK_1_PART_1;
/*
Перестановка цифр
На вход подается двузначное число n.
Выведите число, полученное перестановкой цифр в исходном числе n.
Если после перестановки получается ведущий 0, его также надо вывести.
 */

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(n % 10 + "" + n / 10);
    }
}
