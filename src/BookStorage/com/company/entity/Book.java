package BookStorage.com.company.entity;

/**
 * Создание класса Книга!!!
 */
public class Book {
    private final String author;
    private final String body;


    public Book(String author, String body) {
        this.author = author;
        this.body = body;
    }


    public String getAutor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
