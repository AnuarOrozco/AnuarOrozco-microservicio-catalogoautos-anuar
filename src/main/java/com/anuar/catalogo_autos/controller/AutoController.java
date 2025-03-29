package com.anuar.catalogo_autos.controller;

import com.anuar.catalogo_autos.model.Auto;
import com.anuar.catalogo_autos.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/anuar/api/autos")
public class AutoController {

    @Autowired
    private AutoService autoService;

    @GetMapping("/{id}")
    public Auto getAutoById(@PathVariable Long id) {
        return autoService.getAutoById(id);
    }

    @GetMapping
    public List<Auto> getAllAutos() {
        return autoService.getAllAutos();
    }

}
