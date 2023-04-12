package base_module.HOME_WORK_3_PART_1.Task2;

import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private int[] grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        if (grades.length <= 10) {
            this.grades = grades;
        } else {
            System.out.println("Оценок не должно быть блольше 10, массив обрезан под 10 элементов");
            this.grades = Arrays.copyOf(grades, 10);
        }

    }

    public void addGrades(int score) {
        if (score < 1 || score > 5) {
            System.out.println("Incorrect score");
        } else {

            for (int i = 0; i < grades.length - 1; i++) {
                grades[i] = grades[i + 1];
            }
            grades[grades.length - 1] = score;
        }
    }

    public double averageGrades() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return ((int) ((sum / grades.length) * 100)) / 100.;
    }
}
