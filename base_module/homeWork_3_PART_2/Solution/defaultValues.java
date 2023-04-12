package base_module.HOME_WORK_3_PART_2;

import java.util.ArrayList;

public class defaultValues extends Library {
    public void fillArrayBook(Library array) {
        array.clear();
        array.addBook(new Book("Золотая рыбка", "Пушкин"));
        array.addBook(new Book("Война и мир", "Толстой"));
        array.addBook(new Book("Гранатовый браслет", "Бунин"));
        array.addBook(new Book("Отцы и дети", "Тургенев"));
        array.addBook(new Book("Му му", "Тургенев"));
        array.addBook(new Book("Капитанская дочка", "Пушкин"));
        array.addBook(new Book("Жажда", "Пайк"));
        array.addBook(new Book("Словарь", "Даль"));
        array.addBook(new Book("Букварь", "Кто-то"));
        array.addBook(new Book("Незнайка", "Носов"));
    }

    public void fillArrayVisitors(Library library) {
        ArrayList<Visitor> array = library.getVisitors();
        array.clear();

        array.add(new Visitor("Петя"));
        array.add(new Visitor("Рафаэль"));
        array.add(new Visitor("Геральт"));
        array.add(new Visitor("Ариэль"));
        array.add(new Visitor("Урсула"));
        array.add(new Visitor("Владлена"));
        array.add(new Visitor("Петр"));

        library.setVisitors(array);
    }
}
