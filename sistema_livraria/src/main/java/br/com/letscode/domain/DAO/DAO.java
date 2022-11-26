package br.com.letscode.domain.DAO;

import javax.management.openmbean.OpenDataException;
import java.util.List;
import java.util.Optional;

public interface DAO <T, K>{

    void add(T type);
    void update(T type) throws OpenDataException;
    Optional<T> findOne(K key);
    List<T> findAll();

    void delete(T type);

}
