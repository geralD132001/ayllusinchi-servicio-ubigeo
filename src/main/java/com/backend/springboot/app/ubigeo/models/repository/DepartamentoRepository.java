package com.backend.springboot.app.ubigeo.models.repository;

import com.backend.springboot.app.commons.ubigeo.models.entity.Departamento;
import org.springframework.data.repository.CrudRepository;


public interface DepartamentoRepository extends CrudRepository<Departamento,Long> {
}
