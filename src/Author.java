public class Author {
    private final String nameAndSurname;

    //конструктор для класса Author
    public Author(String nameAndSurname){
        this.nameAndSurname=nameAndSurname;
    }

    //метод для получения информации об авторе
    public String getInfo(){
        return nameAndSurname;
    }
}
