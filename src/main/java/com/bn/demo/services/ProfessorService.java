package com.bn.demo.services;

import com.bn.demo.models.ProfessorModel;
import com.bn.demo.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<ProfessorModel> findAll(){
        return professorRepository.findAll();
    }

}
