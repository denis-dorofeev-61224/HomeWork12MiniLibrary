import java.util.Objects;

public class Book {
    private final String bookname;
    private final String author;
    private int publishYear;

    //конструктор для класса Book
    public Book(String bookname, String author, int publishYear) {
        this.bookname = bookname;
        this.author = author;
        this.publishYear = publishYear;
    }

    //метод для получения информации о книге
    public String getInfo() {
        return bookname + author + "издана в" + publishYear + "году";
    }
    public void setPublishYear(int publishYear){
        this.publishYear=publishYear;
    }
}
