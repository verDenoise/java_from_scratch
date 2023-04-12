package base_module.HOME_WORK_2_PART_2;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        scanner.nextLine();
        String[][] arrStr = new String[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                arrStr[i][j] = scanner.nextLine();
            }
        }

        int[][] arrInt = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arrInt[i][j] = scanner.nextInt();
            }
        }

        double[] res = new double[n];
        for (int i = 0; i < n; i++) {
            int sredn = 0;
            double count = 0;
            for (int j = 0; j < 3; j++) {
                sredn += arrInt[i][j];
                count++;
            }
            res[i] = ((int) ((sredn / count) * 10)) / 10.0;
        }

        int[] maxArr = new int[3];
        for (int i = 0; i < 3; i++) {
            double maximum = res[0];
            for (int j = 1; j < n; j++) {
                if (res[j] > maximum) {
                    maximum = res[j];
                    maxArr[i] = j;
                }
            }
            System.out.println(arrStr[0][maxArr[i]] + ": " + arrStr[1][maxArr[i]] + ", " + res[maxArr[i]]);
            res[maxArr[i]] = 0;
        }
    }
}
