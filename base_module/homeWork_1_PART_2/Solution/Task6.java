package base_module.HOME_WORK_1_PART_2;
/*
Уровень английского
На следующий день на работе Петю и его коллег попросили заполнить анкету.
Один из вопросов был про уровень владения английского.
Петя и его коллеги примерно представляют, сколько они знают иностранных слов.
Также у них есть табличка перевода количества слов в уровень владения английском языком.
Было бы здорово автоматизировать этот перевод!

На вход подается положительное целое число count - количество выученных иностранных слов.
Нужно вывести какому уровню соответствует это количество.

| Количество слов    | Уровень английского |
|----------------------|-----------------------|
| count < 500          | beginner              |
| 500 <= count < 1500  | pre-intermediate      |
| 1500 <= count < 2500 | intermediate          |
| 2500 <= count < 3500 | upper-intermediate    |
| 3500 <= count        | fluent                |
 */

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        if (count < 500) {
            System.out.println("beginner");
        } else if (count < 1500) {
            System.out.println("pre-intermediate");
        } else if (count < 2500) {
            System.out.println("intermediate");
        } else if (count < 3500) {
            System.out.println("upper-intermediate");
        } else {
            System.out.println("fluent");
        }
    }
}
