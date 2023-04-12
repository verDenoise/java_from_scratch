package base_module.HOME_WORK_1_PART_1;
/*
Бюджет
На вход подается баланс счета в банке – n.
Рассчитайте дневной бюджет на 30 дней.
 */

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        final int DAYS = 30;
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println((double) n / DAYS);
    }
}
