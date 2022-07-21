package com.backend.springboot.app.ubigeo.controllers;


import com.backend.springboot.app.commons.ubigeo.models.entity.Comunidad;
import com.backend.springboot.app.ubigeo.models.services.ComunidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins = { "https://ayllusinchis-app.azurewebsites.net" })
@RestController
public class ComunidadController {

    @Autowired
    private ComunidadService comunidadService;

    @GetMapping("/comunidad/listar")
    public ResponseEntity<?> listar() {

        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta");
        result.put("data", comunidadService.findAll());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/comunidad/ver/{id}")
    public ResponseEntity<?> detalle(@PathVariable Long id) throws InterruptedException{

        HashMap<String, Object> result = new HashMap<>();
        Comunidad data = comunidadService.findById(id);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe Comunidad con Id: " + id);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        result.put("success", true);
        result.put("message", "Se ha encontrado el registro.");
        result.put("data", data);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
