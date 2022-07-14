package com.backend.springboot.app.ubigeo.models.services;


import com.backend.springboot.app.commons.ubigeo.models.entity.Distrito;

import java.util.List;

public interface DistritoService {
    public List<Distrito> findAll();

    public Distrito findById(Long id);
}
