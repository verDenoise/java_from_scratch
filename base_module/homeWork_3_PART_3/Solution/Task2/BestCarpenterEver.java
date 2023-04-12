package base_module.HOME_WORK_3_PART_3.Task2;

public class BestCarpenterEver {

    public static void main(String[] args) {

        Table table = new Table();
        System.out.println(isDoThisFurniture(table));

        Stool stool = new Stool();
        System.out.println(isDoThisFurniture(stool));
    }

    public static boolean isDoThisFurniture(Object furniture) {
        return furniture instanceof BestCarpenterEver;
    }
}

class Table extends BestCarpenterEver {

}

class Stool {

}