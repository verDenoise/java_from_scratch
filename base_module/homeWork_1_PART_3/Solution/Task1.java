package base_module.HOME_WORK_1_PART_3;

/*
Напечатать таблицу умножения от 1 до 9. Входных данных нет. Многоточие в
примере ниже подразумевает вывод таблицы умножения и для остальных чисел
2, 3 и т. д.
Пример:
Входные данные Выходные данные
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
1 x 4 = 4
1 x 5 = 5
1 x 6 = 6
1 x 7 = 7
1 x 8 = 8
1 x 9 = 9
--------
… --------
9 x 1 = 9
9 x 2 = 18
9 x 3 = 27
 */
public class HomeWork1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
