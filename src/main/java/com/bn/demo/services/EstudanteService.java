package com.bn.demo.services;

import com.bn.demo.models.EstudanteModel;
import com.bn.demo.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel criarEstudante(EstudanteModel estudanteModel){
        return estudanteRepository.save(estudanteModel);
    }

    public List<EstudanteModel> findAll(){
        return estudanteRepository.findAll();
    }

    public EstudanteModel buscarId(Long id){
        return estudanteRepository.findById(id).get();
    }

    public void deletarEstudante(Long id){
        estudanteRepository.deleteById(id);
    }

    public EstudanteModel atualizarEstudante(Long id, EstudanteModel estudanteModel){
        EstudanteModel estudanteExistente = estudanteRepository.findById(id).get();

        estudanteExistente.setNome(estudanteModel.getNome());
        estudanteExistente.setMatricula(estudanteModel.getMatricula());
        estudanteExistente.setEmail(estudanteModel.getEmail());

        return estudanteRepository.save(estudanteExistente);
    }
}