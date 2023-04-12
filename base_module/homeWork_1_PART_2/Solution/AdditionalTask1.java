package base_module.HOME_WORK_1_PART_2;
/*
Проверить пароль
У Марата был взломан пароль.
Он решил написать программу, которая проверяет его пароль на сложность.

В интернете он узнал, что пароль должен отвечать следующим требованиям:
 пароль должен состоять из хотя бы 8 символов
В пароле должны быть:
 заглавные буквы
 строчные символы
 числа
 специальные знаки (_-)

Если пароль прошел проверку, то программа должна вывести в консоль строку пароль надежный, иначе строку: пароль не прошел проверку

 */

import java.util.Scanner;

public class AdditionalHomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();
        int capitalLetter = 0;
        int uppercaseLetter = 0;
        int number = 0;
        int symbol = 0;
        //примет любой пароль, если в него входят: заглавная, строчная английские буквы; число; специальный знак;
        if (pass.length() >= 8) {
            for (int i = 0; i < pass.length(); i++) {
                char s1 = pass.charAt(i);
                if ((s1 >= 'A' && s1 <= 'Z') && capitalLetter == 0) {

                    capitalLetter++;

                } else if ((s1 >= 'a' && s1 <= 'z') && uppercaseLetter == 0) {

                    uppercaseLetter++;

                } else if ((s1 >= '0' && s1 <= '9') && number == 0) {

                    number++;

                } else if (((s1 >= '!' && s1 <= '/') || (s1 >= ':' && s1 <= '@') || (s1 >= '[' && s1 <= '_')) && symbol == 0) {

                    symbol++;

                }
            }
        } else {
            System.out.println("пароль не прошел проверку");
        }

        if (capitalLetter + uppercaseLetter + number + symbol == 4) {
            System.out.println("пароль надежный");
        } else {
            System.out.println("пароль не прошел проверку");
        }
    }
}
