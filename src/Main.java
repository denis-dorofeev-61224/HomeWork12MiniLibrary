

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world of books!");


        // Создание авторов
        Author author1 = new Author("Гарри ","Гаррисон");
        Author author2 = new Author("Эдмонд ","Гамильтон");

        // Создание книг
        Book book1 = new Book("Билл-герой галактики", author1, 1960);
        Book book2 = new Book("Возвращение к звёздам", author2, 1981);


        // Изменение года публикации книги с помощью сеттера
        book2.setPublishYear(1986);
        System.out.println("Обновленная информация о книге: " + book2.getPublishYear()+" год переиздания.");
    }
}