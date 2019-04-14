package lv.javaguru.tests10.homeWork.levle2;

public class BookRepositoryTest {

    public static void main(String[] args) {

        Repository<Book> bookRepository = new BookRepository();
        bookRepository.save(new Book("1", "Name_1","Author_1",1));
        bookRepository.save(new Book("2", "Name_2","Author_2",2));
        bookRepository.save(new Book("3", "Name_3","Author_3",3));
        bookRepository.save(new Book("4", "Name_4","Author_4",4));
        bookRepository.save(new Book("5", "Name_5","Author_5",5));
        bookRepository.save(new Book("6", "Name_6","Author_6",6));
        bookRepository.save(new Book("7", "Name_7","Author_7",7));
        bookRepository.save(new Book("8", "Name_8","Author_8",8));


        System.out.println(bookRepository.findAll());

        System.out.println(bookRepository.findById("3"));

        bookRepository.save(new Book("9", "Name_9","Author_9",9));
        System.out.println(bookRepository.findAll());

        bookRepository.delete("5");
        System.out.println(bookRepository.findAll());

        //System.out.println(bookRepository.findById("10"));
        //bookRepository.delete("11");
    }
}
