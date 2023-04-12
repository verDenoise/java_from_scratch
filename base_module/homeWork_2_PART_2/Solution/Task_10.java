package base_module.HOME_WORK_2_PART_2;

import java.util.Scanner;

public class HomeWork_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(recursionSumNumber(n));

    }

    public static String recursionSumNumber(int n) {
        if (n / 10 == 0) {
            return n + " ";
        }
        String m = (n % 10) + " ";
        return m + recursionSumNumber(n / 10);
    }
}
