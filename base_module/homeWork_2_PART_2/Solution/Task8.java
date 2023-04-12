package base_module.HOME_WORK_2_PART_2;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(recursionSumNumber(n));

    }

    public static int recursionSumNumber(int n) {
        if (n / 10 == 0) {
            return n;
        }
        int m = n % 10;
        return recursionSumNumber(n / 10) + m;
    }
}
