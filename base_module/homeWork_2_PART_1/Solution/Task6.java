package base_module.HOME_WORK_2_PART_1;
/*
(1 балл) На вход подается строка S, состоящая только из русских заглавных
букв (без Ё).
Необходимо реализовать метод, который кодирует переданную строку с
помощью азбуки Морзе и затем вывести результат на экран. Отделять коды букв
нужно пробелом.

ПРИВЕТ .--. .-. .. .-- . -
УРА ..- .-. .-
 */

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] arrMorze = {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", ".-.",
                "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"};

        char[] arrS = s.toCharArray();
        //1040 - 1071 русские заглавные буквы без Ё
        for (int i = 0; i < arrS.length; i++) {
            System.out.print(arrMorze[arrS[i] - 'А'] + " ");
        }
    }
}
