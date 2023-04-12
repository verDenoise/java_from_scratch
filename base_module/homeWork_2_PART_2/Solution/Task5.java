package base_module.HOME_WORK_2_PART_2;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[] arrUp = new int[n * n / 2 - 1];
        int countUp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                arrUp[countUp] = arr[i][j];
                countUp++;
            }
        }

        int[] arrDown = new int[n * n / 2 - 1];
        int countDown = 0;
        for (int i = n - 1; i > 0; i--) {
            for (int j = n - 1; j > n - i - 1; j--) {
                arrDown[countDown] = arr[j][i];
                countDown++;
            }
        }

        boolean flag = true;
        for (int i = 0; i < n * n / 2 - 1; i++) {
            if (arrDown[i] != arrUp[i]) {
                flag = false;
            }
        }

        System.out.println(flag);
    }
}
