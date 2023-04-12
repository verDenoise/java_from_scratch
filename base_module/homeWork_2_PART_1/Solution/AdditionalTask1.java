package base_module.HOME_WORK_2_PART_1;
/*
(2 балла) Создать программу генерирующую пароль.
На вход подается число N — длина желаемого пароля. Необходимо проверить,
что N >= 8, иначе вывести на экран "Пароль с N количеством символов
небезопасен" (подставить вместо N число) и предложить пользователю еще раз
ввести число N.
Если N >= 8 то сгенерировать пароль, удовлетворяющий условиям ниже и
вывести его на экран. В пароле должны быть:
● заглавные латинские символы
● строчные латинские символы
● числа
● специальные знаки(_*-)
 */

import java.util.Random;
import java.util.Scanner;

public class AdditionalHomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n < 8) {
            System.out.println("Пароль с " + n + " количеством символов небезопасен" + "\nВведите новую дину пароля");
            n = scanner.nextInt();
        }

        char[] arrPas = new char[n];
        for (int i = 0; i < arrPas.length; i++) {
            arrPas[i] = generateChar(i);
        }

        String password = String.valueOf(arrPas);
        System.out.println(password);

    }

    public static char generateChar(int index) {
        Random r = new Random();
        int moreRandom;

        if (index < 4) {
            moreRandom = index;
        } else {
            moreRandom = r.nextInt(4);
        }

        if (moreRandom == 0) {
            return (char) (r.nextInt('Z' - 'A' + 1) + 'A');
        } else if (moreRandom == 1) {
            return (char) (r.nextInt('z' - 'a' + 1) + 'a');
        } else if (moreRandom == 2) {
            return (char) (r.nextInt('9' - '0' + 1) + '0');
        } else {
            int indexSpec = r.nextInt(3);
            char[] charSpec = {'_', '*', '-'};
            return charSpec[indexSpec];
        }
    }
}
