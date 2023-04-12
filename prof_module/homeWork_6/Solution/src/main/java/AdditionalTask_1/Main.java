package AdditionalTask_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(isArmstrongNumber(n));

    }

    static boolean isArmstrongNumber(int number) {

        number = number < 0 ? -1 * number : number;

        char[] arr = String.valueOf(number).toCharArray();

        int sumArm = 0;

        for (char e : arr) {
            sumArm += (int) (Math.pow(e - '0', arr.length));
        }

        return number == sumArm;
    }
}
