package base_module.HOME_WORK_2_PART_1;
/*
7 задача за линейное время

6
-10 -5 1 3 3 8
-->
1 9 9 25 64 100

2
-7 7
-->
49 49
 */

import java.util.Scanner;

public class AdditionalHomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            int j = scanner.nextInt();

            if (j >= 0) {
                arr[i] = j;
            } else {
                arr[i] = j;
                count++;
            }
        }

        int[] arrTempPos = new int[n - count];
        for (int i = 0; i < arrTempPos.length; i++) {
            arrTempPos[i] = arr[count + i];
        }

        int[] arrTempNeg = new int[count];
        for (int i = 0; i < arrTempNeg.length; i++) {
            arrTempNeg[i] = (int) Math.abs(arr[i]);
        }

        count--;
        for (int i = 0, j = 0; i < n; i++, j++) {
            if (j == arrTempPos.length) {

                arr[i] = (int) Math.pow(arrTempNeg[count], 2);
                count--;

            } else if (count >= 0 && arrTempNeg[count] <= arrTempPos[j]) {

                arr[i] = (int) Math.pow(arrTempNeg[count], 2);
                count--;
                j--;

            } else {
                arr[i] = (int) Math.pow(arrTempPos[j], 2);
            }
        }

        for (int ee : arr) {
            System.out.print(ee + " ");
        }
    }
}

