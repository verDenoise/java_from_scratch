package base_module.HOME_WORK_2_PART_1;
/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов. После этого аналогично передается второй
массив (aj) длины M.
Необходимо вывести на экран true, если два массива одинаковы (то есть
содержат одинаковое количество элементов и для каждого i == j элемент ai ==
aj). Иначе вывести false.
Ограничения:
● 0 < N < 100
● 0 < ai < 1000
● 0 < M < 100
● 0 < aj < 1000
Пример:

7
1 2 3 4 5 6 7
7
1 2 3 4 5 6 7
-->
true

3
89 12 46
3
12 89 46
-->
false

1
15
4
2 4 6 8
-->
false
 */

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arrN = new int[N];
        for (int i = 0; i < N; i++) {
            arrN[i] = scanner.nextInt();
        }

        int M = scanner.nextInt();
        int[] arrM = new int[M];
        for (int i = 0; i < M; i++) {
            arrM[i] = scanner.nextInt();
        }

        System.out.println(comparingArrays(arrN, arrM));

//        boolean flag = false;
//        if(N == M){
//            for (int i = 0; i < N; i++) {
//                if(arrN[i] == arrM[i]){
//                    flag = true;
//                }else {
//                    flag = false;
//                    break;
//                }
//            }
//        }
//        System.out.println(flag);
    }

    public static boolean comparingArrays(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
