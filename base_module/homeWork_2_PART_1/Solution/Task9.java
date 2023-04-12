package base_module.HOME_WORK_2_PART_1;
/*

(1 балл) На вход подается число N — длина массива. Затем передается массив
строк из N элементов (разделение через перевод строки). Каждая строка
содержит только строчные символы латинского алфавита.
Необходимо найти и вывести дубликат на экран. Гарантируется что он есть и
только один.

4
hello
java
hi
java


7 today
is
the
most
most
special
day
 */

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] arrS = new String[n];
        for (int i = 0; i < arrS.length; i++) {
            arrS[i] = scanner.next() + "\n";
        }

        System.out.println(findDoubleS(arrS));
    }

    private static String findDoubleS(String[] arrS) {
        for (int i = 0; i < arrS.length; i++) {
            for (int j = 1 + i; j < arrS.length; j++) {
                if (arrS[i].equals(arrS[j])) {
                    return arrS[i];
                }
            }
        }
        return null;
    }
}