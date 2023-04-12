package base_module.HOME_WORK_3_PART_1.Task3;

import base_module.HOME_WORK_3_PART_1.Task2.Student;

import java.util.Random;

public class StudentService {

    public Student bestStudents(Student[] students) {

        Random random = new Random();
        int count = 0;
        double bestStudentGrade = students[0].averageGrades();

        for (int i = 1; i < students.length - 1; i++) {
            if (bestStudentGrade <= students[i + 1].averageGrades()) {
                bestStudentGrade = students[i + 1].averageGrades();
                if (students[i].averageGrades() == students[count].averageGrades()) {
                    return students[random.nextInt(students.length)];
                }
                count = i;
            }
        }
        return students[count];
    }

    public void sortBySurname(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].getSurname().compareToIgnoreCase(students[j + 1].getSurname()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
