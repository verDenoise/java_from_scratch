package base_module.HOME_WORK_1_PART_2;

import java.util.Scanner;

/*
Оценка на ревью
За каждый год работы Петя получает на ревью оценку.
На вход подаются оценки Пети за последние три года (три целых положительных числа).
Если последовательность оценок строго монотонно убывает, то вывести "Петя, пора трудиться"
В остальных случаях вывести "Петя молодец!"
 */
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && b > c) {
            System.out.println("Петя, пора трудиться");
        } else {
            System.out.println("Петя молодец!");
        }
    }
}
