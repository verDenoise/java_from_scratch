package base_module.HOME_WORK_2_PART_2;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrABCK = new int[4];
        for (int i = 0; i < arrABCK.length; i++) {
            arrABCK[i] = scanner.nextInt();
        }

        String[][] arrstr = new String[7][4];
        for (int i = 0; i < arrstr.length; i++) {
            for (int j = 0; j < arrstr[0].length; j++) {
                arrstr[i][j] = scanner.next();
            }
        }

        int[] arrRes = new int[4];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                arrRes[j] += Integer.parseInt(arrstr[i][j]);
            }
        }

        canIeat(arrABCK, arrRes);
    }

    private static void canIeat(int[] arrABCK, int[] arrRes) {
        for (int i = 0; i < arrRes.length; i++) {
            if (arrRes[i] > arrABCK[i]) {
                System.out.println("Нужно есть поменьше");
                return;
            }
        }
        System.out.println("Отлично");
    }
}
