package lv.javaguru.lesson9Homework.levle3;

public class LibraryTest {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("A Author1","E Title1");
        library.addBook("B Author2","D Title2");
        library.addBook("C Author3","C Title3");
        library.addBook("D Author4","B Title4");
        library.addBook("E Author5","A Title5");
        library.addBook("D Author4","F Title6");
        library.printLibrary();

        library.removeBook(3);
        library.printLibrary();
        System.out.println();

        library.findBookByTitle("D Title2");
        System.out.println();

        library.findBooksByAuthor("D Author4");
        System.out.println();

        library.findBooksByAuthor("Author1");
        System.out.println();

        library.findBookByTitle("Title");



    }
}
