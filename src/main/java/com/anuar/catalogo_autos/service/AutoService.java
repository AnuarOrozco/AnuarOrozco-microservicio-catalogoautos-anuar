package com.anuar.catalogo_autos.service;

import com.anuar.catalogo_autos.model.Auto;
import com.anuar.catalogo_autos.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {

    @Autowired
    private AutoRepository autoRepository;

    public Auto getAutoById(Long id) {
        return autoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Auto no encontrado con ID: " + id));
    }

    public List<Auto> getAllAutos() {
        List<Auto> autos = autoRepository.findAll();

        if (autos.isEmpty()) {
            throw new RuntimeException("No se encontraron autos en la base de datos");
        } else {
            return autos;
        }
    }

}
