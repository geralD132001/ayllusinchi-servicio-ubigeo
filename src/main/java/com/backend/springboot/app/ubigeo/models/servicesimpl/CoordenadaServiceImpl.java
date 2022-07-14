package com.backend.springboot.app.ubigeo.models.servicesimpl;


import com.backend.springboot.app.commons.ubigeo.models.entity.Coordenada;
import com.backend.springboot.app.ubigeo.models.repository.ComunidadRepository;
import com.backend.springboot.app.ubigeo.models.repository.CoordenadaRepository;
import com.backend.springboot.app.ubigeo.models.services.CoordenadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CoordenadaServiceImpl implements CoordenadaService {

    @Autowired
    private CoordenadaRepository coordenadaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Coordenada> findAll() {
        return (List<Coordenada>) coordenadaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Coordenada findById(Long id) {
        return coordenadaRepository.findById(id).orElse(null);
    }


}
