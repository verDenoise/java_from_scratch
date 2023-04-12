package prof_module.homeWork_1.task_1;

public class TestMyCheckedException {
    public static void main(String[] args) throws MyCheckedException {

        boolean n = false;

        if (n) {
            System.out.println("n is true");
        } else {
            throw new MyCheckedException("n is false");
        }

    }
}
