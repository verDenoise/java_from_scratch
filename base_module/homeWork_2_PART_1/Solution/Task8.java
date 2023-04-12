package base_module.HOME_WORK_2_PART_1;
/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов. После этого передается число M.
Необходимо найти в массиве число, максимально близкое к M (т.е. такое число,
для которого |ai - M| минимальное). Если их несколько, то вывести
максимальное число.

6
-10 9 -5 -6 1 -3
-4
-->
-3

2
10 20
21
-->
20
 */

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int min = 0;
        int max = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {

            if ((int) Math.abs(arr[i] - m) < (int) Math.abs(arr[i + 1] - m)) {
                min = arr[i];
            } else if ((int) Math.abs(arr[i] - m) > (int) Math.abs(arr[i + 1] - m)) {
                min = arr[i + 1];
            } else {
                for (int num : arr) {
                    if (num > max) {
                        max = num;
                    }
                }
                min = max;
                break;
            }
        }
        System.out.println(min);
    }
}
