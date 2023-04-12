package prof_module.homeWork_2.AdditionalHomeWork;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is", "day"};
        int k = 4;
        System.out.println(moreWords(words, k));

    }

    public static ArrayList<String> moreWords(String[] words, int countWords) {

        Map<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            int count = 1;
            if (map.containsKey(word)) {

                count = map.get(word);
                count++;

            }
            map.put(word, count);
        }

        System.out.println(map);

        Map<Double, String> newMap = new TreeMap<>();

        double count = 1;

        for (Map.Entry<String, Integer> item : map.entrySet()) {

            if (newMap.containsKey((double) -item.getValue())) {

                newMap.put(-item.getValue() - count * 0.001, item.getKey());
                count++;

            } else {

                newMap.put((double) -item.getValue(), item.getKey());

            }
        }

        ArrayList<String> answer = new ArrayList<>();
        int cnt = 0;
        for (Map.Entry<Double, String> item : newMap.entrySet()) {
            if (countWords == cnt) {
                break;
            }
            answer.add(item.getValue());
            cnt++;
        }

        return answer;
    }
}
