package base_module.HOME_WORK_2_PART_1;

import java.util.Scanner;

/*
(1 балл) Необходимо реализовать игру. Алгоритм игры должен быть записан в
отдельном методе. В методе main должен быть только вызов метода с
алгоритмом игры.
Условия следующие:
Компьютер «загадывает» (с помощью генератора случайных чисел) целое
число M в промежутке от 0 до 1000 включительно. Затем предлагает
пользователю угадать это число. Пользователь вводит число с клавиатуры.
Если пользователь угадал число M, то вывести на экран "Победа!". Если
введенное пользователем число меньше M, то вывести на экран "Это число
меньше загаданного." Если введенное число больше, то вывести "Это число
больше загаданного." Продолжать игру до тех пор, пока число не будет отгадано
или пока не будет введено любое отрицательное число.
 */
public class HomeWork_10 {
    public static void main(String[] args) {

        int randNumber = (int) (Math.random() * 1001);

        findNumber(randNumber);
    }

    public static void findNumber(int randNumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Затем предлагает пользователю угадать это число.");

        int n = scanner.nextInt();

        while (n > 0) {
            if (n > randNumber) {
                System.out.println("Это число больше загаданного.");
                n = scanner.nextInt();
            } else if (n < randNumber) {
                System.out.println("Это число меньше загаданного.");
                n = scanner.nextInt();
            } else {
                System.out.println("Победа!");
                break;
            }
        }
    }
}
