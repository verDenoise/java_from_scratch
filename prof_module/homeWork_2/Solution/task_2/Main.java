package prof_module.homeWork_2.task_2;

import java.util.Arrays;
import java.util.Scanner;

/*
astronomers - nomorestars
debit card - bad credit

abcdef - feducb
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String t = scanner.nextLine().trim();

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();

        Arrays.sort(charStr1);
        Arrays.sort(charStr2);

        return Arrays.equals(charStr1, charStr2);
    }
}
