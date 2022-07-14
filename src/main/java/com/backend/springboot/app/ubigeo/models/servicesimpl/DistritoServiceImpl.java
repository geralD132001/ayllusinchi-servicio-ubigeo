package com.backend.springboot.app.ubigeo.models.servicesimpl;


import com.backend.springboot.app.commons.ubigeo.models.entity.Distrito;
import com.backend.springboot.app.ubigeo.models.repository.CoordenadaRepository;
import com.backend.springboot.app.ubigeo.models.repository.DistritoRepository;
import com.backend.springboot.app.ubigeo.models.services.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DistritoServiceImpl implements DistritoService {

    @Autowired
    private DistritoRepository distritoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Distrito> findAll() {
        return (List<Distrito>) distritoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Distrito findById(Long id) {
        return distritoRepository.findById(id).orElse(null);
    }
}
