package prof_module.homeWork_1.AdditionalTask_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int x = arr[0];
        int indexOfx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > x) {
                x = arr[i];
                indexOfx = i;
            }
        }

        int y;
        if ((indexOfx == 0 || indexOfx == arr.length - 1) && (arr.length > 2)) {
            y = arr[arr.length / 2];
        } else if (arr.length <= 2) {
            for (int e : arr) {
                System.out.print(e + " ");
            }
            return;
        } else {
            y = arr[0];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y && i != indexOfx) {
                y = arr[i];
            }
        }
        System.out.println(x + " " + y);
    }
}
