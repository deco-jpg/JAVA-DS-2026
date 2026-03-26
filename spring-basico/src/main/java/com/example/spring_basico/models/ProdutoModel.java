package com.example.spring_basico.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

@Entity
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull()
    private String nome;
    private String dataDeCompra;
    private String dataDeVencimento;
    private String preco;

    public ProdutoModel() {
    }

    public ProdutoModel(Long id, @NonNull() String nome, String dataDeCompra, String dataDeVencimento, String preco) {
        this.id = id;
        this.nome = nome;
        this.dataDeCompra = dataDeCompra;
        this.dataDeVencimento = dataDeVencimento;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NonNull() String getNome() {
        return nome;
    }

    public void setNome(@NonNull() String nome) {
        this.nome = nome;
    }

    public String getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(String dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
