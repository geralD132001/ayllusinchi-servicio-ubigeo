package com.backend.springboot.app.ubigeo.models.servicesimpl;

import com.backend.springboot.app.commons.ubigeo.models.entity.Departamento;
import com.backend.springboot.app.ubigeo.models.repository.DepartamentoRepository;
import com.backend.springboot.app.ubigeo.models.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Departamento> findAll() {
        return (List<Departamento>) departamentoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Departamento findById(Long id) {
        return departamentoRepository.findById(id).orElse(null);
    }
}
