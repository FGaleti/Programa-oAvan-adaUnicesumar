package com.bn.demo.services;

import com.bn.demo.models.AlunoModel;
import com.bn.demo.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoModel> findAll(){
        return alunoRepository.findAll();
    }

}
