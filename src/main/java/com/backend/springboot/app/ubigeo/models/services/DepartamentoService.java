package com.backend.springboot.app.ubigeo.models.services;


import com.backend.springboot.app.commons.ubigeo.models.entity.Departamento;

import java.util.List;

public interface DepartamentoService {
    public List<Departamento> findAll();
    public Departamento findById(Long id);
}
