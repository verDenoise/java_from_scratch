package base_module.HOME_WORK_3_PART_2;

public class Book {
    private final String nameOfBook;
    private final String authorOfBook;
    private Status status = Status.FREE;

    private double estimation = 0;
    private int count = 0;

    Book(String nameOfBook, String authorOfBook) {
        this.nameOfBook = nameOfBook.trim();
        this.authorOfBook = authorOfBook.trim();
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getEstimation() {
        if (count == 0) {
            return "Оценок нет";
        } else {
            return String.format("%.1f", estimation / count);
        }
    }

    public void setEstimation(Double estimation) {
        if (estimation > 10 || estimation < 1) {
            System.out.println("Оценка не защитывается, тк должна быть от 1 до 10");
        } else {
            count++;
            this.estimation += estimation;
        }
    }
}
