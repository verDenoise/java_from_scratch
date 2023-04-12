package prof_module.homeWork_3.AdditionalHomeWork_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String str1 = "(()()())";
        String str2 = ")(";
        String str3 = "(()";
        String str4 = "((()))";

        String str5 = "())(()";
        String str6 = "";

        System.out.println(isCorrectSequence(str6 + str1 + str4));

    }

    public static boolean isCorrectSequence(String str) {

        if (str.isEmpty()) {
            return true;
        }

        if (str.length() % 2 != 0 || str.charAt(0) == ')') {
            return false;
        }

        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            arr.add(str.charAt(i));
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == ')') {
                arr.remove(i);
                arr.remove(i - 1);
                i = 0;
            }
        }

        return arr.size() == 0;
    }
}
