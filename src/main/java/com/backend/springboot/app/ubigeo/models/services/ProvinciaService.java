package com.backend.springboot.app.ubigeo.models.services;


import com.backend.springboot.app.commons.ubigeo.models.entity.Provincia;

import java.util.List;

public interface ProvinciaService {
    public List<Provincia> findAll();

    public Provincia findById(Long id);
}
