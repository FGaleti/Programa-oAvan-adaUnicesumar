package com.bn.demo.controllers;

import com.bn.demo.models.EstudanteModel;
import com.bn.demo.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public EstudanteModel criar(@RequestBody EstudanteModel estudanteModel) {
        return estudanteService.criarEstudante(estudanteModel);
    }

    @GetMapping
    public List<EstudanteModel> listarTodos() {
        return estudanteService.findAll();
    }

    @GetMapping("/{id}")
    public EstudanteModel buscarId(@PathVariable Long id) {
        return estudanteService.buscarId(id);
    }

    @PutMapping("/{id}")
    public EstudanteModel atualizarEstudante(@PathVariable Long id, @RequestBody EstudanteModel estudanteModel) {
        return estudanteService.atualizarEstudante(id, estudanteModel);
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id) {
        estudanteService.deletarEstudante(id);
    }
}