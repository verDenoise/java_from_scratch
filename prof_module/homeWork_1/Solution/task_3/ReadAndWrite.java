package prof_module.homeWork_1.task_3;

import java.io.*;
import java.util.Scanner;

public class ReadAndWrite {

    private static final String OUTPUT_FILE_NAME = "output.txt";
    private static final String INPUT_FILE_NAME = "input.txt";

    public static void main(String[] args) {
        ReadAndWrite();
    }

    public static void ReadAndWrite() {
        Scanner scanner = null;
        try (Writer wr = new FileWriter(OUTPUT_FILE_NAME)) {
            scanner = new Scanner(new File(INPUT_FILE_NAME));
            while (scanner.hasNextLine()) {
                wr.write(scanner.nextLine().toUpperCase() + "\r\n");
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            System.out.println("LOG IO Ex " + ex);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
