public class Book {
        String bookname;
        Author author;
        int publishYear;

    //конструктор для класса Book
    public Book(String bookname, Author author, int publishYear) {
        this.bookname = bookname;
        this.author = author;
        this.publishYear = publishYear;
    }
    //метод для получения информации о названии книги
    public String getBookName(){
        return bookname+" ";
    }
    //метод для получения информации об авторе
    public Author getAuthor(){
        return author;
    }
    public int getPublishYear(){
        return publishYear;
    }
    // Сеттер для года публикации
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    }
