package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Estudiante;
import com.example.demo.repository.EstudianteRepository;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository repository;

    // Registrar estudiante
    public Estudiante registrar(Estudiante estudiante) {

       
        if (repository.buscarPorId(estudiante.getId()) != null) {
            throw new RuntimeException("El estudiante con ese ID ya existe");
        }

        return repository.guardar(estudiante);
    }

  
    public List<Estudiante> listar() {
        return repository.listar();
    }
}

