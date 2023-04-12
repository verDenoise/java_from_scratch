package base_module.HOME_WORK_3_PART_3.Task4;
/*
Раз в год Петя проводит конкурс красоты для собак. К сожалению, система
хранения участников и оценок неудобная, а победителя определить надо. В
первой таблице в системе хранятся имена хозяев, во второй - клички животных,
в третьей — оценки трех судей за выступление каждой собаки. Таблицы
связаны между собой только по индексу. То есть хозяин i-ой собаки указан в i-ой
строке первой таблицы, а ее оценки — в i-ой строке третьей таблицы. Нужно
помочь Пете определить топ 3 победителей конкурса.
На вход подается число N — количество участников конкурса. Затем в N
строках переданы имена хозяев. После этого в N строках переданы клички
собак. Затем передается матрица с N строк, 3 вещественных числа в каждой —
оценки судей. Победителями являются три участника, набравшие
максимальное среднее арифметическое по оценкам 3 судей. Необходимо
вывести трех победителей в формате “Имя хозяина: кличка, средняя оценка”.
Гарантируется, что среднее арифметическое для всех участников будет
различным.

4
Иван
Николай
Анна
Дарья
Жучка
Кнопка
Цезарь
Добряш
7 6 7
8 8 7
4 5 6
9 9 9
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final int topThree = 3;
    public static int[] indexOfTopThree = new int[topThree];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Participant> participants = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            participants.add(new Participant(i, scanner.nextLine()));
        }

        for (int i = 0; i < n; i++) {
            dogs.add(new Dog(i, scanner.nextLine()));
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < dogs.get(i).getRating().length; j++) {
                dogs.get(i).getRating()[j] = scanner.nextInt();
            }
        }

        topThreeWinners(participants, dogs);
    }

    private static void topThreeWinners(ArrayList<Participant> participants, ArrayList<Dog> dogs) {
        for (int i = 0; i < topThree; i++) {
            double maxEstimation = dogs.get(0).getEstimation();
            for (int j = 1; j < dogs.size(); j++) {
                if (dogs.get(j).getEstimation() > maxEstimation) {
                    maxEstimation = dogs.get(j).getEstimation();
                    indexOfTopThree[i] = dogs.get(j).getIndex();
                }
            }
            System.out.println(participants.get(indexOfTopThree[i]).getName() + ": " + dogs.get(indexOfTopThree[i]).getNameOfDog() + ", " + dogs.get(indexOfTopThree[i]).getEstimation());
            dogs.remove(indexOfTopThree[i]);
        }
    }
}

class Participant {
    private final int index;
    private final String name;

    Participant(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog {
    private final int index;
    private final String nameOfDog;
    private final static int MaxLenghtRating = 3;
    private final double[] rating = new double[MaxLenghtRating];

    Dog(int index, String nameOfDog) {
        this.index = index;
        this.nameOfDog = nameOfDog;

    }

    public int getIndex() {
        return index;
    }

    public String getNameOfDog() {
        return nameOfDog;
    }

    public double[] getRating() {
        return rating;
    }

    public double getEstimation() {
        double estimation = 0;
        for (int i = 0; i < rating.length; i++) {
            estimation += rating[i];
        }
        return ((int) ((estimation / rating.length) * 10)) / 10.0;
    }
}




