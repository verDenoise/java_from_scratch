package base_module.HOME_WORK_3_PART_2;

public class Visitor {
    private final String nameOfVisitor;
    private Integer ID = null;
    private Book book = null;

    Visitor(String nameOfVisitor) {
        this.nameOfVisitor = nameOfVisitor.trim();
    }

    public String getNameOfVisitor() {
        return nameOfVisitor;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
