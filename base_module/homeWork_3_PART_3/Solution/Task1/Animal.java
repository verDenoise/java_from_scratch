package base_module.HOME_WORK_3_PART_3.Task1;

abstract class Animal {

    public void eat() {
        System.out.println("Кушаем");
    }

    public void sleep() {
        System.out.println("Спим");
    }

}

interface Flying {
    void fly();
}

interface Swimming {
    void swim();
}

interface Mammal {
    void wayOfBirth();
}

interface Fish {
    void wayOfBirth();
}

interface Bird {
    void wayOfBirth();
}

class Bat extends Animal implements Mammal, Flying {

    @Override
    public void fly() {
        System.out.println("Летаем медленно");
    }

    @Override
    public void wayOfBirth() {
        System.out.println("живородящие");
    }
}

class Dolphin extends Animal implements Mammal, Swimming {

    @Override
    public void swim() {
        System.out.println("Плаваем быстро");
    }

    @Override
    public void wayOfBirth() {
        System.out.println("живородящие");
    }
}

class GoldFish extends Animal implements Fish, Swimming {

    @Override
    public void swim() {
        System.out.println("Плаваем медленно");
    }

    @Override
    public void wayOfBirth() {
        System.out.println("мечут икру");
    }
}


class Eagle extends Animal implements Bird, Flying {

    @Override
    public void fly() {
        System.out.println("Летаем быстро");
    }

    @Override
    public void wayOfBirth() {
        System.out.println("откладывают яйца");
    }
}