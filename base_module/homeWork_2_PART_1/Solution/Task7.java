package base_module.HOME_WORK_2_PART_1;
/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов, отсортированный по возрастанию.
Необходимо создать массив, полученный из исходного возведением в квадрат
каждого элемента, упорядочить элементы по возрастанию и вывести их на
экран.

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

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(scanner.nextInt(), 2);
            //arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for (int ee : arr) {
            System.out.print(ee + " ");
        }
    }
}
