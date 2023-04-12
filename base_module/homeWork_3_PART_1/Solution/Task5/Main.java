package base_module.HOME_WORK_3_PART_1.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DayOfWeek[] days = new DayOfWeek[7];

        for (int i = 0; i < days.length; i++) {
            days[i] = new DayOfWeek();
            days[i].setNumberOfDay(scanner.nextByte());
            scanner.nextLine();
            days[i].setNameOfDay(scanner.nextLine());
        }

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i].getNumberOfDay() + " " + days[i].getNameOfDay());
        }
    }
}
