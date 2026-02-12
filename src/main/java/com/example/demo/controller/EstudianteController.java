package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Estudiante;
import com.example.demo.service.EstudianteService;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    // POST /estudiantes
    @PostMapping
    public ResponseEntity<Estudiante> registrar(@RequestBody Estudiante estudiante) {
        Estudiante nuevo = service.registrar(estudiante);
        return ResponseEntity.status(201).body(nuevo);
    }

    // GET /estudiantes
    @GetMapping
    public ResponseEntity<List<Estudiante>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}
