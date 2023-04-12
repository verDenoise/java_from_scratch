package base_module.HOME_WORK_1_PART_1;
/*
Привет
Прочитайте из консоли имя пользователя и выведите в консоль строку:
Привет, <имя пользователя>!
 */

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName + "!");
    }
}
