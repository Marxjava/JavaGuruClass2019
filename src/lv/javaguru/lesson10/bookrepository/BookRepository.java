package lv.javaguru.lesson10.bookrepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<BookEntity> {

    private Map<Long, BookEntity> storage = new HashMap<>();

    @Override
    public List<BookEntity> findAll() {
        return null;
    }

    @Override
    public BookEntity findById(Long id) {
        return null;
    }

    @Override
    public void save(BookEntity entity) {


    }

    @Override
    public void delete(Long id) {

    }
}
