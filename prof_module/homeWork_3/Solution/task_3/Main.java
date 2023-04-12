package prof_module.homeWork_3.task_3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        int argument = 123;
//        String argument = "asd";
//        Integer argument = 321;
//        Double argument = 3.04;

        APrinter myClas = new APrinter();
        invoke(myClas, argument);
    }

    public static <T> void invoke(Object myClas, T argument) {

        Method method = null;
        try {

            method = myClas.getClass().getDeclaredMethod("print", argument.getClass());

            method.setAccessible(true);

            method.invoke(myClas, argument);

        } catch (NoSuchMethodException | IllegalAccessException e) {
            System.out.println("Метод не найден");

        } catch (InvocationTargetException e) {
            System.out.println("invoke не отработал");
        }
    }
}
