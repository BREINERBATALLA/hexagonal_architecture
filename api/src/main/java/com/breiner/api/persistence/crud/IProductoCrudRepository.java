package com.breiner.api.persistence.crud;

import com.breiner.api.persistence.entity.ProductoEntidad;
import org.springframework.data.repository.CrudRepository;

public interface IProductoCrudRepository extends CrudRepository<ProductoEntidad, Integer> {
}
