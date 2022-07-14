package com.backend.springboot.app.ubigeo.models.services;


import com.backend.springboot.app.commons.ubigeo.models.entity.Comunidad;

import java.util.List;

public interface ComunidadService {
    public List<Comunidad> findAll();

    public Comunidad findById(Long id);

}
