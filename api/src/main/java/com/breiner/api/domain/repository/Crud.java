package com.breiner.api.domain.repository;

import java.util.List;
import java.util.Optional;

public interface Crud<T,k> {

    List<T> getAll();
    Optional<T> get(k id);
    void delete(k id);
    T save(T t);
    void update(T t);

}
