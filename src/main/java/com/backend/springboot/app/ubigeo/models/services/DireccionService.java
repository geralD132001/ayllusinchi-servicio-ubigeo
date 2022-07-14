package com.backend.springboot.app.ubigeo.models.services;


import com.backend.springboot.app.commons.ubigeo.models.entity.Direccion;

import java.util.List;

public interface DireccionService {

    public List<Direccion> findAll();

    public Direccion findById(Long id);
}
