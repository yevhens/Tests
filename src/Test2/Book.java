package Test2;

public class Book {

    String book;
    String authname;

    public Book(String book, String name) {
        this.book = book;
        this.authname = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book='" + book + '\'' +
                ", authname='" + authname + '\'' +
                '}';
    }
}
