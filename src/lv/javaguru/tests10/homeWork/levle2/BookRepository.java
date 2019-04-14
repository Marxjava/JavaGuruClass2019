package lv.javaguru.tests10.homeWork.levle2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<Book> {

    private Map<String, Book> storage = new HashMap<>();

    @Override
    public List<Book> findAll() {
        return new ArrayList(storage.values());
    }

    @Override
    public Book findById(String id) {
        if (storage.containsKey(id)) {
            return storage.get(id);
        }
        throw new ItemNotFoundException("No entity with id: " + id);
    }

    @Override
    public void save(Book book) {
        storage.put(book.getId(), book);
    }

    @Override
    public void delete(String id) {
        if (storage.containsKey(id)) {
            storage.remove(id);
        } else {
            throw new ItemNotFoundException("No entity with id: " + id);
        }
    }
}
