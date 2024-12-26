package ir.maktabsharif.hw10.repository;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<T , ID> {
    void save(T t);
    Optional<T> findById(ID id);
    void delete(T t);
    List<T> findAll();
    Class<T> getEntityClass();
}
