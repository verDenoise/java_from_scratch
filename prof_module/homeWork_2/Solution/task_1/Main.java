package prof_module.homeWork_2.task_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listString = new ArrayList<>();
        listString.add("meow");
        listString.add("how");
        listString.add("how");

        ArrayList<Integer> listInteger = new ArrayList<>();
        listInteger.add(22);
        listInteger.add(22);

        System.out.println(method(listInteger));


    }

    public static <T> Set<T> method(ArrayList<T> list) {
        Set<T> setList = new HashSet<>(list);

        return setList;
    }
}
