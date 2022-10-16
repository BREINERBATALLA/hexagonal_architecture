package com.breiner.api.persistence.crud;

import com.breiner.api.persistence.entity.ClienteEntidad;
import org.springframework.data.repository.CrudRepository;

public interface IClienteCrudRepository extends CrudRepository<ClienteEntidad, Integer> {
}
