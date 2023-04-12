package prof_module.homeWork_1.task_4;

public class MyEvenNumber {
    private int n;

    MyEvenNumber(int n) throws MyEvenNumberException {
        if (n % 2 == 0) {
            this.n = n;
        } else {
            throw new MyEvenNumberException("Ввели нечетное");
        }
    }


}

