package prof_module.homeWork_4.AdditionalTask_1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "cats";

//        String str1 = "cat";
//        String str2 = "cut";

//        String str1 = "cat";
//        String str2 = "nut";

        System.out.println(isCanIEquals(str1.trim(), str2.trim()));
    }

    public static boolean isCanIEquals(String strFirst, String strSecond) {

        int difference = Math.abs(strFirst.length() - strSecond.length());
        int maxLength = Math.max(strFirst.length(), strSecond.length());

        if (difference > 1) {
            return false;
        }

        String str = strFirst + strSecond;
        char[] strArr = str.toCharArray();

        Set<Character> set = new HashSet<>();
        for (char el : strArr) {
            set.add(el);
        }

        return set.size() <= maxLength + 1 - difference;
    }
}
