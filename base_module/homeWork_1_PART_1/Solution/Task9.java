package base_module.HOME_WORK_1_PART_1;
/*
 Количество гостей
На вход подается бюджет мероприятия – n тугриков.
Бюджет на одного гостя – k тугриков.
Вычислите и выведите, сколько гостей можно пригласить на мероприятие.
 */

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(n / k);
    }
}
