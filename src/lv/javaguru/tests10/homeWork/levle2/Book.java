package lv.javaguru.tests10.homeWork.levle2;

import java.util.Objects;

public class Book {

    private String id;
    private String name;
    private String author;
    private int pagesCount;

    public Book(String id, String name, String author, int pagesCount) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, pagesCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book that = (Book) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(author, that.author) &&
                pagesCount == that.pagesCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages count='" + pagesCount + '\'' +
                "}\n";
    }
}
