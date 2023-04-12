package base_module.HOME_WORK_2_PART_2;
/*
3
1 2 3
1 7 3
1 2 3
7
*/

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int p = scanner.nextInt();

        int countI = 0;
        int countJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (p == arr[i][j]) {
                    countI = i;
                    countJ = j;
                    break;
                }
            }
        }

        int[][] arrCopy = new int[n - 1][n - 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != countI && j != countJ) {
                    if (i == n - 1 && j == n - 1) {
                        arrCopy[i - 1][j - 1] = arr[i][j];
                    } else if (i == n - 1) {
                        arrCopy[i - 1][j] = arr[i][j];
                    } else if (j == n - 1) {
                        arrCopy[i][j - 1] = arr[i][j];
                    } else {
                        arrCopy[i][j] = arr[i][j];
                    }
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(arrCopy[i][j] + " ");
            }
            System.out.println();
        }
    }
}
