package base_module.HOME_WORK_3_PART_3.Task1;

public class Main {
    public static void main(String[] args) {
        Bat bat = new Bat();
        System.out.println("Летучая мышка");
        bat.fly();
        bat.eat();
        bat.wayOfBirth();
        bat.sleep();
        System.out.println();

        Dolphin dolphin = new Dolphin();
        System.out.println("Дельфин");
        dolphin.swim();
        dolphin.eat();
        dolphin.wayOfBirth();
        dolphin.sleep();
        System.out.println();

        GoldFish goldFish = new GoldFish();
        System.out.println("Золотая рыбка");
        goldFish.swim();
        goldFish.eat();
        goldFish.wayOfBirth();
        goldFish.sleep();
        System.out.println();

        Eagle eagle = new Eagle();
        System.out.println("Орел");
        eagle.fly();
        eagle.eat();
        eagle.wayOfBirth();
        eagle.sleep();
        System.out.println();
    }
}
