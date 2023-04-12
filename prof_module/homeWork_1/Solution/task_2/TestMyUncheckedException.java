package prof_module.homeWork_1.task_2;

public class TestMyUncheckedException {
    public static void main(String[] args) {

        int[] num = new int[10];

        try {
            System.out.println(num[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new MyUncheckedException("work");
        }

    }
}
