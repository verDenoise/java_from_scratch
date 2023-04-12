package base_module.HOME_WORK_3_PART_1.Task7;

import java.util.Scanner;

/*
1 1 2 - false
1 2 3 - false
3 3 3 - true
3 4 5 - true
 */
public class TriangleChecker {
    public static boolean isTriangleChecker(double x, double y, double z) {
        return x + y > z && x + z > y && y + z > x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        System.out.println(isTriangleChecker(x, y, z));
    }
}
