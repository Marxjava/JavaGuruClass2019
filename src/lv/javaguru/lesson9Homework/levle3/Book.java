package lv.javaguru.lesson9Homework.levle3;

public class Book {

    private final String author;
    private final String title;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "\nBook author is: " + author + ", the book title is: " + title;
    }
}
