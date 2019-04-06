package lv.javaguru.lesson9.bookstore;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private Genre genre;

    public Book(Genre genre, String title, String author) {
        this.genre = genre;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return genre.getValue() + " - " + title + " (" + author + ") ";
    }

    @Override
    public int compareTo(Book book) {
        return title.compareTo(book.title);
    }

    public String getAuthor() {
        return author;
    }
}
