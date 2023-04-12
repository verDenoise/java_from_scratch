package base_module.HOME_WORK_3_PART_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        System.out.println("Библиотека открыта. Давайте заполним ее книгами.");

        int choise;
        do {
            System.out.println("\n" +
                               "1 - добавить книги; 11 - добавляем книги программно; 12 - добавляем посетителей программно\n" +
                               "2 - вывести все книги в библиотеке; 22 - Вывести всех посетителей библиотеки \n" +
                               "3 - удалить книгу; \n" +
                               "4 - возврат книги в библиотеку; \n" +
                               "5 - возврат нескольких книг по автору \n" +
                               "6 - Одолжить книгу незнакомцу \n" +
                               "7 - Одолжить книгу посетителю \n" +
                               "8 - Узнать у кого книга\n" +
                               "9 - Возврат книги от посетителя\n");
            choise = scanner.nextInt();
            scanner.nextLine();
            switch (choise) {
                case 1: {
                    System.out.println("Введите название и автора книги через Enter или ничего не вводите как устанете добавлять книги");
                    String sc;
                    do {
                        library.addBook(new Book(scanner.nextLine(), sc = scanner.nextLine()));
                        System.out.println("---------------------------------------");
                    } while (!sc.equals(""));
                    break;
                }
                case 11: {
                    new defaultValues().fillArrayBook(library);
                    break;
                }
                case 12: {
                    new defaultValues().fillArrayVisitors(library);
                    break;
                }
                case 2: {
                    library.printTheBooks();
                    break;
                }
                case 22: {
                    library.printVisitors();
                    break;
                }
                case 3: {
                    System.out.println("Введите название книги для удаления из библиотеки");
                    library.deleteBook(scanner.nextLine());//Проверить
                    break;
                }
                case 4: {
                    System.out.println("Введите название книги, которую хотите вернуть");
                    library.returnTheBook(scanner.nextLine());
                    break;
                }
                case 5: {
                    System.out.println("Введите имя автора, чтобы вернуть его книги");
                    library.returnTheListOfBook(scanner.nextLine());
                    break;
                }
                case 6: {
                    System.out.println("Введите название книги, которую хотите");
                    library.borrowTheBook(scanner.nextLine());
                    break;
                }
                case 7: {
                    System.out.println("Введите название книги, которую хотите и имя человека");
                    library.borrowTheBook(scanner.nextLine(), scanner.nextLine());
                    break;
                }
                case 8: {
                    System.out.println("Введите название книги");
                    library.whoIsBorrowTheBook(scanner.nextLine());
                    break;
                }
                case 9: {
                    System.out.println("Введите название книги и имя того, кто возвращает");
                    library.returnTheBook(scanner.nextLine(), scanner.nextLine());
                    break;
                }
                default: {
                    System.out.println("Введите корректную команду или 0 для выхода");
                    choise = scanner.nextInt();
                }
            }
        } while (choise != 0);
    }
}




