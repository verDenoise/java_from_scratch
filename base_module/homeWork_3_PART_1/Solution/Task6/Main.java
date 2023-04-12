package base_module.HOME_WORK_3_PART_1.Task6;

public class Main {
    public static void main(String[] args) {
        AmazingString amazingString = new AmazingString("a a b a b");

        System.out.println(amazingString.lengthAmazingString());
        System.out.println(amazingString.findSymbol(1));

        amazingString.printAmazingString();

        System.out.println("-----------------------------------------------------");
        // System.out.println(amazingString.isFindSubstring(new char[]{'a', ' ', 'b'}));
        System.out.println(amazingString.isFindSubstring("b a"));
        System.out.println("-----------------------------------------------------");

        amazingString.deleteSpace();
        System.out.println(amazingString.getArr());
        amazingString.reversStr();
        System.out.println(amazingString.getArr());
    }
}
