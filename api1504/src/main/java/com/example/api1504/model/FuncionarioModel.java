package com.example.api1504.model;

import jakarta.persistence.*;

@Entity
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private double salario;
    private String email;
    @Enumerated(EnumType.STRING)
    private SetorEnum setorEnum;
    @Enumerated(EnumType.STRING)
    private GeneroEnum generoEnum;

    public FuncionarioModel() {
    }

    public FuncionarioModel(Long id, String nome, int idade, double salario, String email, SetorEnum setorEnum, GeneroEnum generoEnum) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.email = email;
        this.setorEnum = setorEnum;
        this.generoEnum = generoEnum;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SetorEnum getSetorEnum() {
        return setorEnum;
    }

    public void setSetorEnum(SetorEnum setorEnum) {
        this.setorEnum = setorEnum;
    }

    public GeneroEnum getGeneroEnum() {
        return generoEnum;
    }

    public void setGeneroEnum(GeneroEnum generoEnum) {
        this.generoEnum = generoEnum;
    }
}
