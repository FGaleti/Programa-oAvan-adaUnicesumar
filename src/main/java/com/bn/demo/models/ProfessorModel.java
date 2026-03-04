package com.bn.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_PROFESSOR") // adiciona um nome personalizado no nome da tabela

public class ProfessorModel {

    @Id // gera a chave primária no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera o id automaticamente
    private Long id;
    // cria atributo nome no banco
    private String nome;
    private String especialidade;

    public ProfessorModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}


