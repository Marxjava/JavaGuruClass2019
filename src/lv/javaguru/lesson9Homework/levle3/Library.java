package lv.javaguru.lesson9Homework.levle3;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(String author1, String title1) {
        books.add(new Book(author1, title1));
    }

    public void removeBook(int bookNumber) {
        books.remove(bookNumber - 1);
    }

    public void printLibrary() {
        System.out.println(books);
    }

    public void findBookByTitle(String bookTitle) {
        int numberOfResults = 0;
        for (Book book : books) {
            if (bookTitle.equals(book.getTitle())) {
                numberOfResults = getNumberOfResults(numberOfResults, book);
            }
        }
        if (numberOfResults < 1) {
            System.out.println("A book with that title was not found!!! :( ");
        }
    }

    public void findBooksByAuthor(String bookAuthor) {
        int numberOfResults = 0;
        for (Book book : books) {
            if (bookAuthor.equals(book.getAuthor())) {
                numberOfResults = getNumberOfResults(numberOfResults, book);
            }
        }
        if (numberOfResults < 1) {
            System.out.println("Any book with that author was not found!!! :( ");
        }
    }

    private int getNumberOfResults(int numberOfResults, Book book) {
        System.out.println("Search results: Book author is: " + book.getAuthor() + ", the book title is: " + book.getTitle());
        numberOfResults++;
        return numberOfResults;
    }
}
