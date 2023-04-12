package base_module.HOME_WORK_3_PART_2;

import java.util.ArrayList;

import static base_module.HOME_WORK_3_PART_2.Status.BORROWED;
import static base_module.HOME_WORK_3_PART_2.Status.FREE;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Visitor> visitors = new ArrayList<>();
    private static Integer ID = 0;

    protected ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    protected void setVisitors(ArrayList<Visitor> visitors) {
        this.visitors = visitors;
    }

    public void addBook(String nameOfBook, String nameOfAuthor) {
        nameOfBook = nameOfBook.trim();
        nameOfAuthor = nameOfAuthor.trim();
        if (!nameOfBook.equals("") && !nameOfAuthor.equals("")) {
            Book foundBook = findTheBook(nameOfBook);
            if (foundBook == null) {
                this.books.add(new Book(nameOfBook, nameOfAuthor));
            } else {
                System.out.println("Книга не была добавлена, тк в библиотеке есть такая же");
            }
        }
    }

    public void addBook(Book book) {
        if (!books.contains(book) && !book.getNameOfBook().equals("") && !book.getAuthorOfBook().equals("")) {
            Book foundBook = findTheBook(book.getNameOfBook());
            if (foundBook == null) {
                this.books.add(book);
            } else {
                System.out.println("Книга не была добавлена, тк в библиотеке есть такая же");
            }
        }
    }

    public void deleteBook(String nameOfBook) {
        Book foundBook = findTheBook(nameOfBook);
        if (foundBook == null) {
            System.out.println("Такой книги изначально не было в библиотеке");
        } else if (foundBook.getStatus() == FREE) {
            books.remove(foundBook);
        } else {
            System.out.println("Книга в настоящий момент одолжена");
        }
    }

    public void returnTheBook(String nameOfBook) {
        Book foundBook = findTheBook(nameOfBook);
        if ((foundBook != null) && (foundBook.getStatus() == BORROWED)) {
            foundBook.setStatus(FREE);
            System.out.println("Книга возвращена");
        } else if ((foundBook != null) && (foundBook.getStatus() == FREE)) {
            System.out.println("Книга " + foundBook.getNameOfBook() + " автора " + foundBook.getAuthorOfBook() + " - не была одолжена и находится в библиотеке");
        } else {
            System.out.println("Книги " + nameOfBook + " - изначально не было в библиотеке");
        }
    }

    public void returnTheListOfBook(String nameOfAuthor) {
        nameOfAuthor = nameOfAuthor.trim();
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getAuthorOfBook().equals(nameOfAuthor) && book.getStatus() == BORROWED) {
                book.setStatus(FREE);
                System.out.println(book.getNameOfBook() + " была возвращена");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Нет книг для возврата по этому автору");
        }
    }

    public void borrowTheBook(String nameOfBook) {
        Book foundBook = findTheBook(nameOfBook);
        if (foundBook == null) {
            System.out.println("Такой книги нет, но приходите попозже");
        } else {
            foundBook.setStatus(BORROWED);
        }
    }

    public Book findTheBook(String nameOfBook) {
        nameOfBook = nameOfBook.trim();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getNameOfBook().equals(nameOfBook)) {
                return book;
            }
        }
        return null;
    }

    public void printTheBooks() {
        if (books.isEmpty()) {
            System.out.println("Библиотека без книг...");
        } else {
            System.out.println("\n\t Name \t\t\t\t\t\t Author \t\t\t\t\t\t Status");
            for (Book book : books) {
                System.out.printf("\t %s \t\t\t\t %s \t\t\t\t\t\t %s\n", book.getNameOfBook(), book.getAuthorOfBook(), book.getStatus());
            }
            System.out.println();
        }
    }

    public void clear() {
        books.clear();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Механизм одалживания книги посетителю. Каждый посетитель в один момент времени может читать только одну книгу.

    public void borrowTheBook(String nameOfBook, String nameOfVisitor) {

        Visitor visitor = findVisitor(nameOfVisitor);
        if (visitor == null) {
            visitor = new Visitor(nameOfVisitor);
        }

        Book ourBook = borrowTheBookVisitor(nameOfBook);

        if (ourBook != null) {
            if (visitor.getID() == null) {

                visitor.setBook(ourBook);
                visitor.setID(++ID);
                if (!visitors.contains(visitor)) {
                    visitors.add(visitor);
                }

            } else if (visitor.getBook() != null) {

                ourBook.setStatus(FREE);
                System.out.println("Прежде чем брать - верните");

            } else {

                visitor.setBook(ourBook);

            }
        }
    }

    public void returnTheBook(String nameOfBook, String nameOfVisitor) {
        nameOfBook = nameOfBook.trim();
        Visitor visitor = findVisitor(nameOfVisitor);
        if (visitor != null && visitor.getBook() != null) {
            if (visitor.getBook().getNameOfBook() != null && visitor.getBook().getNameOfBook().equals(nameOfBook)) {
                returnTheBook(nameOfBook);
                visitor.setBook(null);
            } else {
                System.out.println("Возврат не произошел");
            }
        } else {
            System.out.println("Возврат не произошел");
        }
    }

    private Book borrowTheBookVisitor(String nameOfBook) {
        Book foundBook = findTheBook(nameOfBook);
        if (foundBook == null) {
            System.out.println("Такой книги нет в нашей библиотеке");
        } else if (foundBook.getStatus() == BORROWED) {
            System.out.println("Книга уже одолжена");
        } else {
            foundBook.setStatus(BORROWED);
            return foundBook;
        }
        return null;
    }

    public void whoIsBorrowTheBook(String nameOfBook) {
        nameOfBook = nameOfBook.trim();
        for (int i = 0; i < visitors.size(); i++) {
            Visitor visitor = visitors.get(i);
            if (visitor.getBook() != null && visitor.getBook().getNameOfBook().equals(nameOfBook)) {
                System.out.printf("\nКнигу взял(а) %s с номером ID = %d\n", visitor.getNameOfVisitor(), visitor.getID());
                return;
            }
        }
        if (findTheBook(nameOfBook) == null) {
            System.out.println("Такой книги нет в библиотеке");
        } else {
            System.out.println("Никто не брал ее");
        }
    }

    private Visitor findVisitor(String nameOfVisitor) {
        nameOfVisitor = nameOfVisitor.trim();
        if (nameOfVisitor.isEmpty()) {
            System.out.println("Не указали имя");
        } else {
            for (int i = 0; i < visitors.size(); i++) {
                Visitor visitor = visitors.get(i);
                if (visitor.getNameOfVisitor().equals(nameOfVisitor)) {
                    return visitor;
                }
            }
        }
        return null;
    }

    public void printVisitors() {
        if (visitors.isEmpty()) {
            System.out.println("Посетителей нет...");
        } else {
            for (int i = 0; i < visitors.size(); i++) {
                Visitor visitor = visitors.get(i);
                System.out.printf("%s %d\n", visitor.getNameOfVisitor(), visitor.getID());
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Добавить функционал оценивания книг посетителем при возвращении в
    //библиотеку. Оценка книги рассчитывается как среднее арифметическое оценок
    //всех посетителей, кто брал эту книгу. Реализовать метод, возвращающий
    //оценку книги по её наименованию.

    public void returnTheBook(String nameOfBook, String nameOfVisitor, double estimation) {

        returnTheBook(nameOfBook, nameOfVisitor);

        Book ourBook = findTheBook(nameOfBook);
        Visitor ourVisitor = findVisitor(nameOfVisitor);

        if (ourBook != null && ourVisitor != null) {
            if (ourBook.getStatus() == FREE && ourVisitor.getBook() == null) {
                ourBook.setEstimation(estimation);
            }
        }
    }

    public void printEstimationOfBook(String nameOfBook) {

        Book ourBook = findTheBook(nameOfBook);
        if (ourBook != null) {
            System.out.println(ourBook.getEstimation());
        }
    }

}
