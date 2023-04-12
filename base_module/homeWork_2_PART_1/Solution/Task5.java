package base_module.HOME_WORK_2_PART_1;

import java.util.Scanner;

/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов. После этого передается число M — величина
сдвига.
Необходимо циклически сдвинуть элементы массива на M элементов вправо.
Ограничения:
● 0 < N < 100
● -1000 < ai < 1000
● 0 <= M < 100
Пример:

5
38 44 0 -11 2
2
-->
-11 2 38 44 0

2
12 15
0
-->
12 15
 */
public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        while (m > n) {
            m = m - n;
        }

        while (m > 0) {
            int temp = arr[arr.length - 1];
            System.arraycopy(arr, 0, arr, 1, arr.length - 1);
            arr[0] = temp;
            m--;
        }

        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

