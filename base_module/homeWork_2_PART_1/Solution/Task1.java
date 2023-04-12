package base_module.HOME_WORK_2_PART_1;
/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
вещественных чисел (ai) из N элементов.
Необходимо реализовать метод, который принимает на вход полученный
массив и возвращает среднее арифметическое всех чисел массива.
Вывести среднее арифметическое на экран.
Ограничения:
● 0 < N < 100
● 0 < ai < 1000
Пример:

3
1.5 2.7 3.14
-->
2.4466666666666668

2
30.42 12
-->
21.21

 */

import java.util.Locale;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);//чтобы идея не ругалась на точчки при вводе данных в консоль

        int N = scanner.nextInt();

        double[] arr = new double[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextDouble();
        }

        System.out.println(arithmeticMean(arr));
    }

    public static double arithmeticMean(double[] arr) {

        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result / arr.length;
    }
}
