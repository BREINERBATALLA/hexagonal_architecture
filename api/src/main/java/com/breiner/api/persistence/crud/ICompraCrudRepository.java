package com.breiner.api.persistence.crud;

import com.breiner.api.persistence.entity.CompraEntidad;
import org.springframework.data.repository.CrudRepository;

public interface ICompraCrudRepository extends CrudRepository<CompraEntidad, Integer> {
}
