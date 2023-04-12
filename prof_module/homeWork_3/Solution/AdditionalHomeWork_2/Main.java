package prof_module.homeWork_3.AdditionalHomeWork_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String str1 = "{()[]()}";       //t
        String str2 = "{)(}";           //f
        String str3 = "[}";             //f
        String str4 = "[{(){}}][()]{}"; //t

        String str5 = "(()()())";
        String str6 = "";

        System.out.println(isCorrectSequence(str1));

    }

    public static boolean isCorrectSequence(String str) {

        char[][] answ = {{'(', ')'}, {'{', '}'}, {'[', ']'}};

        if (str.isEmpty()) {
            return true;
        }

        if (str.length() % 2 != 0) {
            return false;
        }

        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            arr.add(str.charAt(i));
        }

        for (int count = 0; count < answ.length; count++) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == answ[count][1]) {
                    for (int j = i; j >= 0; j--) {
                        if (arr.get(j) == answ[count][0]) {
                            arr.remove(i);
                            arr.remove(j);
                            i = 0;
                        }
                    }
                }
            }
        }

        System.out.println(arr);

        return arr.size() == 0;
    }
}
