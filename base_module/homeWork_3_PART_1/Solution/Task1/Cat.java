package base_module.HOME_WORK_3_PART_1.Task1;

import java.util.Random;

public class Cat {
    private void sleep() {
        System.out.println("Sleep");
    }

    private void meow() {
        System.out.println("Meow");
    }

    private void eat() {
        System.out.println("Eat");
    }

    public void status() {
        Random randomGenerator = new Random();
        int randNumber = randomGenerator.nextInt(3);
        switch (randNumber) {
            case 0:
                sleep();
                break;
            case 1:
                meow();
                break;
            case 2:
                eat();
                break;
        }
    }
}
