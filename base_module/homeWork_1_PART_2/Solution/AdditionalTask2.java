package base_module.HOME_WORK_1_PART_2;
/*
Проверка посылки
У нас есть почтовая посылка (String mailPackage).
Каждая почтовая посылка проходит через руки проверяющего.
Работа проверяющего заключается в следующем:
 во-первых, посмотреть не пустая ли посылка;
 во-вторых, проверить нет ли в ней камней или запрещенной продукции.

Наличие камней или запрещенной продукции указывается в самой посылке в конце или в начале.
Если в посылке есть камни, то будет написано слово "камни!", если запрещенная продукция, то будет фраза "запрещенная продукция".
После осмотра посылки проверяющий должен сказать:
 "камни в посылке" – если в посылке есть камни;
 "в посылке запрещенная продукция" – если в посылке есть что-то запрещенное;
 "в посылке камни и запрещенная продукция" – если в посылке находятся камни и запрещенная продукция;
 "все ок" – если с посылкой все хорошо.

Если посылка пустая, то с посылкой все хорошо.
Напишите программу, которая будет заменять проверяющего.
 */

import java.util.Scanner;

public class AdditionalHomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String StrStones = new String("камни!");
        String StrForbiddenProducts = new String("запрещенная продукция");

        String mailPackage = scanner.nextLine();

        if ((mailPackage.indexOf(StrStones) != -1) && (mailPackage.indexOf(StrForbiddenProducts) != -1)) {

            System.out.println("в посылке камни и запрещенная продукция");

        } else if (mailPackage.indexOf(StrStones) != -1) {

            System.out.println("камни в посылке");

        } else if (mailPackage.indexOf(StrForbiddenProducts) != -1) {

            System.out.println("в посылке запрещенная продукция");

        } else {
            System.out.println("все ок");
        }
    }
}
