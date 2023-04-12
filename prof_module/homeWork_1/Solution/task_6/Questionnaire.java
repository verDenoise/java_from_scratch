package prof_module.homeWork_1.task_6;

import java.util.Calendar;

public class Questionnaire {
    private String name;
    private Calendar dateOfBirthday;
    private String gender;
    private String height;

    public Questionnaire(String name, Calendar dateOfBirthday, String gender, String height) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        this.gender = gender;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public Calendar getDateOfBirthday() {
        return dateOfBirthday;
    }

    public String getGender() {
        return gender;
    }

    public String getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "name='" + name + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                ", gender=" + gender +
                ", height=" + height +
                '}';
    }
}
