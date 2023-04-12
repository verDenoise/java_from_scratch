package base_module.HOME_WORK_3_PART_2;

public class MainForTest {
    public static void main(String[] args) {

        Library library = new Library();

        new defaultValues().fillArrayBook(library);
        new defaultValues().fillArrayVisitors(library);

        //---1
        library.addBook("", "Носов");
        library.addBook(new Book("Незнайка", ""));

        library.addBook("Незнайка", "Носов");
        library.addBook(new Book("Незнайка", "Носов"));

        library.addBook("Незнайка", "Нос");
        library.addBook(new Book("Незнайка", "Нос"));

        library.addBook("Незнайка на Луне", "Носов");
        library.addBook(new Book("Незнайка на Луне", "Носов"));

        library.borrowTheBook("Незнайка");
        library.borrowTheBook("Незнайка на Луне", "Петя");

        library.printTheBooks();

        library.addBook("Незнайка", "Носов");
        library.addBook(new Book("Незнайка на Луне", "Носов"));

        //---2
        library.deleteBook("Незнайка");
        library.deleteBook("Незнайка на Луне");
        library.deleteBook("Му му");
        library.deleteBook("Словарь");

        library.printTheBooks();

        //---3
        library.returnTheBook("Незнайка");

        //---4
        library.borrowTheBook("Золотая рыбка");
        library.borrowTheBook("Капитанская дочка");
        library.returnTheListOfBook("Пушкин");
        library.returnTheListOfBook("Тургенев");

        library.printTheBooks();

        //---5
        library.borrowTheBook("Знайка", "Кристина");
        library.borrowTheBook("Незнайка", "Кристина");
        library.borrowTheBook("Незнайка", "Петр");
        library.borrowTheBook("Жажда", "Кристина");

        library.printVisitors();
        library.whoIsBorrowTheBook("Незнайка");
        library.whoIsBorrowTheBook("Знайка");
        library.whoIsBorrowTheBook("Жажда");

        //---6
        library.returnTheBook("Знайка", "Кристина");
        library.returnTheBook("Незнайка", "ДругоеИмя");
        library.returnTheBook("Незнайка", "Кристина");
        library.returnTheBook("Жажда", "Кристина");
        library.returnTheBook("Незнайка", "Кристина");
        library.returnTheBook(" Незнайка на Луне ", "Петя ");

        library.whoIsBorrowTheBook("Незнайка");

        library.printTheBooks();
        library.printVisitors();

        //---8
        System.out.println("-------------------------------------------------------------------");
        library.borrowTheBook("Незнайка", "Кристина");
        library.returnTheBook("Незнайка", "Кристина", 10);

        library.printEstimationOfBook("Незнайка");
        library.printEstimationOfBook("Жажда");

        library.borrowTheBook("Жажда", "Кристина");
        library.returnTheBook("Жажда", "Кристина", 5);

        library.borrowTheBook("Незнайка", "Вася");
        library.returnTheBook("Незнайка", "Кристина", 10);

        library.borrowTheBook("Незнайка", "Вася");
        library.returnTheBook("Незнайка", "Кристина", 10);

        library.borrowTheBook("Незнайка", "Вася");
        library.returnTheBook("Незнайка", "Кристина", 10);
        library.returnTheBook("Незнайка", "Вася", 5);

        library.printEstimationOfBook("Незнайка");
        library.printEstimationOfBook("Жажда");


        library.returnTheBook("Незнайка", "Толик", 1);

        library.borrowTheBook("Незнайка", "Хейтер");
        library.returnTheBook("Незнайка", "Хейтер", -5);


        library.printEstimationOfBook("Незнайка");
        library.printEstimationOfBook("Жажда");
        library.printEstimationOfBook("Букварь");
    }
}
