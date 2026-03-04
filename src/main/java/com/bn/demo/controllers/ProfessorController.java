package com.bn.demo.controllers;

import com.bn.demo.models.ProfessorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/schools")
public class ProfessorController {

    @Autowired
    private ProfessorController professorController;

    @GetMapping
    public List<ProfessorModel>findAll(){
        return professorController.findAll();
    }



}
