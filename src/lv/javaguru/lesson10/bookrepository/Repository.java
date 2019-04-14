package lv.javaguru.lesson10.bookrepository;

import java.util.List;

public interface Repository<T> {

    List<T> findAll();

    T findById(Long id);

    void save(T entity);

    void delete(Long id);

}
