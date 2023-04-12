package base_module.HOME_WORK_1_PART_2;
/*
Покупка телефона
Старый телефон Андрея сломался, поэтому он решил приобрести новый.
Продавец телефонов предлагает разные варианты, но Андрея интересуют только модели серии samsung или iphone.
Также Андрей решил рассматривать телефоны только от 50000 до 120000 рублей.
Чтобы не тратить время на разговоры, Андрей хочет написать программу, которая поможет ему сделать выбор.

На вход подается строка – модель телефона и число – стоимость телефона.
Нужно вывести "Можно купить", если модель содержит слово samsung или iphone и стоимость от 50000 до 120000 рублей включительно.
Иначе вывести "Не подходит".

Гарантируется, что в модели телефона не указано одновременно несколько серий.
 */
import java.util.Scanner;

public class AdditionalHomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_PRICE = 120_000;
        final int MIN_PRICE = 50_000;
        final String iphone = new String("iphone");
        final String samsung = new String("samsung");

        String str = scanner.nextLine();
        int price = scanner.nextInt();

        if (str.indexOf(iphone) != -1 || str.indexOf(samsung) != -1) {

            if (price >= MIN_PRICE && price <= MAX_PRICE) {
                System.out.println("Можно купить");
            } else {
                System.out.println("Не подходит");
            }

        } else {
            System.out.println("Не подходит");
        }
    }
}
