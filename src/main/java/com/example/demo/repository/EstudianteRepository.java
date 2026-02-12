package com.example.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Estudiante;

@Repository
public class EstudianteRepository {

    private Map<String, Estudiante> estudiantes = new HashMap<>();

   
    public Estudiante guardar(Estudiante estudiante) {
        estudiantes.put(estudiante.getId(), estudiante);
        return estudiante;
    }


    public Estudiante buscarPorId(String id) {
        return estudiantes.get(id);
    }

  
    public List<Estudiante> listar() {
        return new ArrayList<>(estudiantes.values());
    }
}

