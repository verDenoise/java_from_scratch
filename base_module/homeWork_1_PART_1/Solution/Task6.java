package base_module.HOME_WORK_1_PART_1;
/*
Километры в мили
На вход подается количество километров count.
Переведите километры в мили (1 миля = 1,60934 км) и выведите количество миль.
 */

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        final double KM_IN_MILE = 1.60934;
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        System.out.println(count / KM_IN_MILE);
    }
}
