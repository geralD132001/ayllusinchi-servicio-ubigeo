package com.backend.springboot.app.ubigeo.controllers;


import com.backend.springboot.app.commons.ubigeo.models.entity.Distrito;
import com.backend.springboot.app.ubigeo.models.services.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins = { "https://ayllusinchis-app.azurewebsites.net" })
@RestController
public class DistritoController {

    @Autowired
    private DistritoService distritoService;

    @GetMapping("/distrito/listar")
    public ResponseEntity<?> listar() {

        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta");
        result.put("data", distritoService.findAll());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/distrito/ver/{id}")
    public ResponseEntity<?> detalle(@PathVariable Long id) throws InterruptedException{

        HashMap<String, Object> result = new HashMap<>();
        Distrito data = distritoService.findById(id);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe Distrito con Id: " + id);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        result.put("success", true);
        result.put("message", "Se ha encontrado el registro.");
        result.put("data", data);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
