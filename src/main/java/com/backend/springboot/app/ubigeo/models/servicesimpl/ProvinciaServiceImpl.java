package com.backend.springboot.app.ubigeo.models.servicesimpl;


import com.backend.springboot.app.commons.ubigeo.models.entity.Provincia;
import com.backend.springboot.app.ubigeo.models.repository.CoordenadaRepository;
import com.backend.springboot.app.ubigeo.models.repository.ProvinciaRepository;
import com.backend.springboot.app.ubigeo.models.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {

    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Provincia> findAll() {
        return (List<Provincia>) provinciaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Provincia findById(Long id) {
        return provinciaRepository.findById(id).orElse(null);
    }
}
