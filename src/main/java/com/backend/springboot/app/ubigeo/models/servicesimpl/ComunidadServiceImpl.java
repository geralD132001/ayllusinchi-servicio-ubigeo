package com.backend.springboot.app.ubigeo.models.servicesimpl;

import com.backend.springboot.app.commons.ubigeo.models.entity.Comunidad;
import com.backend.springboot.app.ubigeo.models.repository.ComunidadRepository;
import com.backend.springboot.app.ubigeo.models.services.ComunidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ComunidadServiceImpl implements ComunidadService {
    @Autowired
    private ComunidadRepository comunidadRepository;

    @Override
    @Transactional (readOnly = true)
    public List<Comunidad> findAll() {
        return (List<Comunidad>)  comunidadRepository.findAll();
    }

    @Override
    @Transactional (readOnly = true)
    public Comunidad findById(Long id) {
        return comunidadRepository.findById(id).orElse(null);
    }
}
