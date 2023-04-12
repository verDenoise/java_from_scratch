package prof_module.homeWork_3.task_2;

import prof_module.homeWork_3.task_1.IsLike;
import prof_module.homeWork_3.task_1.Test;

public class TestReflectionAnnotation {
    public static void main(String[] args) {

        readAnnotation(Test.class);
    }

    static void readAnnotation(Class<?> cls) {
        if (!cls.isAnnotationPresent(IsLike.class)) {
            return;
        }

        IsLike isLike = cls.getAnnotation(IsLike.class);
        System.out.println(isLike.like());
    }
}
