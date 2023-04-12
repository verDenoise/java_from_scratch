package prof_module.homeWork_1.task_6;

import java.text.SimpleDateFormat;
import java.util.Date;

import static prof_module.homeWork_1.task_6.Gender.Female;
import static prof_module.homeWork_1.task_6.Gender.Male;


public class FormValidator {

    public static void checkName(String str) throws Exception {

        char firstSymbol = str.charAt(0);

        if ((str.length() < 2 || str.length() > 20) || !Character.isUpperCase(firstSymbol)) {
            throw new Exception("длина имени должна быть от 2 до 20\n" +
                    "символов, первая буква заглавная");
        }

    }

    public static void checkBirthdate(String str) throws Exception {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        int date = Integer.parseInt(str);
        int dateNow = Integer.parseInt(dateFormat.format(new Date()));

        if (date < 1900_01_01 || date > dateNow) {
            throw new Exception("дата рождения должна быть не\n" +
                    "раньше 01.01.1900 и не позже текущей даты");
        }
    }

    public static void checkGender(String str) throws Exception {


        if (!str.equals(Male.toString()) & !str.equals(Female.toString())) {
            throw new Exception("пол должен корректно матчится в\n" +
                    "enum Gender, хранящий Male и Female значения");
        }
    }

    public static void checkHeight(String str) throws Exception {
        try {

            double height = Double.parseDouble(str);

            if (height < 0.0) {
                throw new Exception("рост должен быть положительным\n" +
                        "числом и корректно конвертироваться в double");
            }

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Рост это число");
        }
    }
}
