package base_module.HOME_WORK_1_PART_1;

import java.util.Scanner;

/*
   Вычислите и выведите на экран объем шара, получив его радиус r с консоли.
*/
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        System.out.println((4.0 / 3) * Math.PI * Math.pow(r, 3));
    }
}
