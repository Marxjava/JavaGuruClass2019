package lv.javaguru.lesson9.bookstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bookstore {

    public static void main(String[] args) {
        List<Book> books = createBooks();
        print(books, "Unsorted list: ");
        Collections.sort(books);
        print(books, "Sorted list by title: ");
        books.sort(new BookAuthorComparator());
        print(books, "Sorted list by author: ");

    }

    private static void print(List<Book> books, String message) {
        System.out.println("===" + message + "===");
        books.forEach(System.out::println);
        System.out.println("======================");
    }

    private static List<Book> createBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(Genre.HORROR, "The female Persuasion", "Meg Wolitzer"));
        books.add(new Book(Genre.NOVEL, "True roots", "Kristin Cavallari"));
        books.add(new Book(Genre.DETECTIVE, "A Day in the Life of Marlon Bundo", "Kristin Cavallari"));
        books.add(new Book(Genre.DRAMA, "She felt like feeling nothing", "r.h. Sin"));
        books.add(new Book(Genre.HORROR, "The rational bible: Exodus", "Denis Prager"));
        books.add(new Book(Genre.NOVEL, "Ready player one", "Ernest Cline"));
        return books;
    }

}
