package base_module.HOME_WORK_1_PART_2;
/*
Дни до субботы
После вкусного обеда Петя принимается за подсчет дней до выходных.
Календаря под рукой не оказалось, а если спросить у коллеги Феди, то тот называет только порядковый номер дня недели, что не очень удобно.
Поэтому Петя решил написать программу, которая по порядковому номеру дня недели выводит сколько осталось дней до субботы.
А если же сегодня шестой (суббота) или седьмой (воскресенье) день, то программа выводит "Ура, выходные!"
 */

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while ((n < 1) || (n > 7)) {
            n = scanner.nextInt();
        }

        if (n > 5) {
            System.out.println("Ура, выходные!");
        } else {
            System.out.println(6 - n);
        }
    }
}
