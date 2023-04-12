package base_module.HOME_WORK_3_PART_1.Task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        Random random = new Random();

        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(6) + 1;
        }
        student.setName("Vasiya");
        student.setSurname("Krizheva");
        student.setGrades(arr);

        System.out.println(student.getName() + "  " + student.getSurname());
        for (int elem : student.getGrades()) {
            System.out.print(elem + " ");
        }

        System.out.println();

        student.addGrades(5);

        for (int elem : student.getGrades()) {
            System.out.print(elem + " ");
        }

        System.out.println();
        System.out.println(student.averageGrades());

    }
}
