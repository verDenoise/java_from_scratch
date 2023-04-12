package base_module.HOME_WORK_3_PART_3.Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            arrayList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrayList.get(i).add(j + i);
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.get(i).size(); j++) {
                System.out.print(arrayList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
