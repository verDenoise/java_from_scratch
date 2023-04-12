package prof_module.homeWork_3.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

interface firstInterface extends fourInterface {

}

interface secondInterface {

}

interface thirdInterface extends secondInterface {

}

interface fourInterface extends fiveInterface {

}

interface fiveInterface {

}

class A implements firstInterface {

}

class B extends A implements thirdInterface {

}

class C extends B {

}


public class Main {
    public static void main(String[] args) {

        Class<?> cls = C.class;
        Class<?> cls2 = HashMap.class;

        for (Class<?> i : getAllInterfaces(cls)) {
            System.out.println(i.getName());
        }
    }

    public static List<Class<?>> getAllInterfaces(Class<?> cls) {

        List<Class<?>> interfaces = new ArrayList<>();

        while (cls != Object.class && cls != null) {
            interfaces.addAll(Arrays.asList(cls.getInterfaces()));
            cls = cls.getSuperclass();
        }

        List<Class<?>> interfaces2 = new ArrayList<>(interfaces);

        for (Class<?> elem : interfaces2) {
            interfaces.addAll(getAllInterfaces(elem));
        }

        return interfaces;
    }

}
