package base_module.HOME_WORK_1_PART_2;
/*
Разделение строки 1
Петя недавно изучил строки в джаве и решил попрактиковаться с ними.
Ему хочется уметь разделять строку по первому пробелу.
Для этого он может воспользоваться методами indexOf() и substring().

На вход подается строка. Нужно вывести две строки, полученные из входной разделением по первому пробелу.
 */

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(s.substring(0, s.indexOf(" ")));
        System.out.println(s.substring(s.indexOf(" ") + 1));
    }
}
