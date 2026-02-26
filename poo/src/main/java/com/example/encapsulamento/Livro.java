package com.example.encapsulamento;

public class Livro {
    private String titulo;
    private String autor;
    private int numero_paginas;
    private double preco;
    
    public Livro(String titulo, String autor, int numero_paginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_paginas = numero_paginas;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    
}
