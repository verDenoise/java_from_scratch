package base_module.HOME_WORK_2_PART_1;
/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов, отсортированный по возрастанию.
Необходимо вывести на экран построчно сколько встретилось различных
элементов. Каждая строка должна содержать количество элементов и сам
элемент через пробел.
Ограничения:
● 0 < N < 100
● -1000 < ai < 1000
Пример:
6
7 7 7 10 26 26
-->
3 7
1 10
2 26

2
-5 7
-->
1 -5
1 7

 */

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int j = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[j] == arr[i]) {
                count++;
                if (i + 1 == arr.length) {
                    System.out.print(count + " " + arr[i] + "\n");
                }
            } else {
                j = i--;
                System.out.print(count + " " + arr[i] + "\n");
                count = 0;
            }
        }
    }
}

