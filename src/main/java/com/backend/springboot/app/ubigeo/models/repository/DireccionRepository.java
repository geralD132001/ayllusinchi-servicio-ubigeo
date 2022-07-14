package com.backend.springboot.app.ubigeo.models.repository;

import com.backend.springboot.app.commons.ubigeo.models.entity.Direccion;
import org.springframework.data.repository.CrudRepository;


public interface DireccionRepository extends CrudRepository<Direccion,Long> {
}
