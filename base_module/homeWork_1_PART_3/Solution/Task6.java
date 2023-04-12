package base_module.HOME_WORK_1_PART_3;

import java.util.Scanner;

/*
В банкомате остались только купюры номиналом 8 4 2 1. Дано положительное
число n - количество денег для размена. Необходимо найти минимальное
количество купюр с помощью которых можно разменять это количество денег
(соблюсти порядок: первым числом вывести количество купюр номиналом 8,
вторым - 4 и т д)
Ограничения:
0 < n < 1000000
Пример:
51 --> 6 0 1 1
10 --> 1 0 1 0
60 --> 7 1 0 0
 */
public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 8; i > 0; i = i / 2) {
            int j = n / i;
            System.out.print(j + " ");
            n = n % i;
        }
    }
}
