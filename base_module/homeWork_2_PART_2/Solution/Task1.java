package base_module.HOME_WORK_2_PART_2;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = arr[i][0];
            for (int j = 1; j < m; j++) {
                if (res[i] > arr[i][j]) {
                    res[i] = arr[i][j];
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

