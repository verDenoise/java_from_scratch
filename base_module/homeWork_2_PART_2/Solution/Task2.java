package base_module.HOME_WORK_2_PART_2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        for (int i = y1; i <= y2; i++) {
            for (int j = x1; j <= x2; j++) {
                if (i > y1 && i < y2 && j > x1 && j < x2) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print(arr[i][n - 1]);
            System.out.println();
        }
    }
}
