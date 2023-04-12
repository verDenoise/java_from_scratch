package base_module.HOME_WORK_2_PART_1;
/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов, отсортированный по возрастанию. После этого
вводится число X — элемент, который нужно добавить в массив, чтобы
сортировка в массиве сохранилась.
Необходимо вывести на экран индекс элемента массива, куда нужно добавить
X. Если в массиве уже есть число равное X, то X нужно поставить после уже
существующего.
Ограничения:
● 0 < N < 100
● -1000 < ai < 1000
● -1000 < X < 1000
Пример:

6
10 20 30 40 45 60
12
-->
1

5
-1 0 2 2 3
2
-->
4
 */

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int X = scanner.nextInt();

        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (X < arr[i]) {
                pos = i;
                break;
            }
            if (X >= arr[i]) {
                pos = i + 1;
            }
        }
        System.out.println(pos);
    }
}
