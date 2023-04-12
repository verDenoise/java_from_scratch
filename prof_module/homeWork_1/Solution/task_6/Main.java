package prof_module.homeWork_1.task_6;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Questionnaire questionnaire = new Questionnaire("Денис", new GregorianCalendar(1998, 5, 9), "Male", "1.83");
        //Questionnaire questionnaire = new Questionnaire("1234", new GregorianCalendar(10, 5, 9), "M;ale", "1.;83");

        try {
            FormValidator.checkName(String.valueOf(questionnaire.getName()));

            FormValidator.checkBirthdate(dateFormat.format(questionnaire.getDateOfBirthday().getTime()));

            FormValidator.checkGender(questionnaire.getGender());

            FormValidator.checkHeight(String.valueOf(questionnaire.getHeight()));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
