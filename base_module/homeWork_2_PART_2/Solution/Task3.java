package base_module.HOME_WORK_2_PART_2;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[][] arr = new String[n][n];

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = "0";
            }
        }

        for (int i = -2; i <= 2; i++) {
            for (int j = 2; j >= -2; j--) {
                if (y + i > 0
                        && x + j > 0
                        && y + i < n
                        && x + j < n
                        && i != j
                        && i != -j
                        && i != 0
                        && j != 0) {

                    arr[y + i][x + j] = "X";

                }
            }
        }

        arr[y][x] = "K";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print(arr[i][n - 1]);
            System.out.println();
        }
    }
}
