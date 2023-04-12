package base_module.HOME_WORK_3_PART_1.Task8;

public class Main {
    public static void main(String[] args) {

        Atm atmUSD = new Atm(100, Valute.USD);

        Atm atmRUB = new Atm(0.01, Valute.RUB);


        System.out.println(atmUSD.convertUSDinRUB(100));
        System.out.println(atmRUB.convertRUBInUSD(100));

        System.out.println(atmRUB.returnCount());
    }
}
