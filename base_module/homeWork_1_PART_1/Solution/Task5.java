package base_module.HOME_WORK_1_PART_1;
/*
 Дюймы в сантиметры
Переведите дюймы в сантиметры (1 дюйм = 2,54 сантиметров).
На вход подается количество дюймов count, выведите количество сантиметров.
 */

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        final double CM_IN_INCH = 2.54;
        Scanner scanner = new Scanner(System.in);

        int inch = scanner.nextInt();
        System.out.println(CM_IN_INCH * inch);
    }
}
