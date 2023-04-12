package prof_module.homeWork_1.AdditionalTask_2;

import java.util.Scanner;

/*
решить за логарифмическую сложность
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int p = scanner.nextInt();

        int low = 0, high = arr.length - 1;

        System.out.println(findP(arr, p, low, high));
    }

    private static int findP(int[] arr, int p, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == p) {
                return mid;
            } else if (arr[mid] > p) {
                high = mid - 1;
            } else if (arr[mid] < p) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
