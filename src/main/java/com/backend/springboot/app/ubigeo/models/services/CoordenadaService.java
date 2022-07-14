package com.backend.springboot.app.ubigeo.models.services;


import com.backend.springboot.app.commons.ubigeo.models.entity.Coordenada;

import java.util.List;


public interface CoordenadaService {
    public List<Coordenada> findAll();

    public Coordenada findById(Long id);
}
