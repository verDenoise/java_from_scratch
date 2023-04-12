package base_module.HOME_WORK_1_PART_2;

import java.util.Scanner;

/*
Время обедать
Петя снова пошел на работу.
С сегодняшнего дня он решил ходить на обед строго после полудня.
Периодически он посматривает на часы (x - час, который он увидел).
Помогите Пете решить, пора ли ему на обед или нет.
Если время больше полудня, то вывести "Пора". Иначе - “Рано”.
 */
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n > 12) {
            System.out.println("Пора");
        } else {
            System.out.println("Рано");
        }
    }
}
