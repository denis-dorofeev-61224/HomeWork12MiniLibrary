

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world of books!");

        //создание авторов
        Author author1=new Author("Гарри Гаррисон ");
        Author author2=new Author("Эдмонд Гамильтон ");

        //создание книг
        Book book1=new Book("Билл-герой галактики ","Гарри Гаррисон ",1960);
        Book book2=new Book("Эдмнонд Гамильтон ","Возвращение к звёздам ",1981);

        //добавление сеттера о годе публикации
        book2.setPublishYear(1986);
        System.out.println("Обновлённая информация о книге: "+book2.getInfo());

    }
}