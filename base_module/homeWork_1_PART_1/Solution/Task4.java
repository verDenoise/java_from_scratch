package base_module.HOME_WORK_1_PART_1;
/*
 Текущее время
На вход подается количество секунд, прошедших с начала текущего дня – count.
Выведите в консоль текущее время в формате: часы и минуты.
 */

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        final int PER_SEC = 60;
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        count /= PER_SEC;

        System.out.println(count / PER_SEC + " " + count % PER_SEC);
    }
}
