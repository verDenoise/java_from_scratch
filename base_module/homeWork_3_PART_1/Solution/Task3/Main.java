package base_module.HOME_WORK_3_PART_1.Task3;

import base_module.HOME_WORK_3_PART_1.Task2.Student;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setName(scanner.nextLine());
            students[i].setSurname(scanner.nextLine());
            students[i].setGrades(new int[]{random.nextInt(5) + 1, random.nextInt(5) + 1, random.nextInt(5) + 1, random.nextInt(5) + 1, random.nextInt(5) + 1});
        }

        StudentService studentService = new StudentService();

        System.out.println(studentService.bestStudents(students).getName() + " " + studentService.bestStudents(students).getSurname());
        System.out.println("////////////////");
        studentService.sortBySurname(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + " " + students[i].getSurname());
        }
    }
}
