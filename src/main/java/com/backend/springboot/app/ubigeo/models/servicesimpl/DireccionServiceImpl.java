package com.backend.springboot.app.ubigeo.models.servicesimpl;

import com.backend.springboot.app.commons.ubigeo.models.entity.Direccion;
import com.backend.springboot.app.ubigeo.models.repository.DireccionRepository;
import com.backend.springboot.app.ubigeo.models.services.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DireccionServiceImpl implements DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Direccion> findAll() {
        return (List<Direccion>) direccionRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Direccion findById(Long id) {
        return direccionRepository.findById(id).orElse(null);
    }
}
