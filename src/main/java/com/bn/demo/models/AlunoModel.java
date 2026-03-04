package com.bn.demo.models;

import jakarta.persistence.*;

@Entity // cria entidade no banco
@Table(name = "TBL_ALUNO") // adiciona um nome personalizado no nome da tabela
public class AlunoModel {

    @Id // gera a chave primária no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera o id automaticamente
    private Long id;
    // cria atributo nome no banco
    private String nome;
    private String cpf;
    private String email;

    public AlunoModel() {

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
