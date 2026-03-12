package org.example.atividade1;

public class Pato implements Animal{
    @Override
    public String emitirSom() {
        return "Duck Duck";
    }

    @Override
    public String comer() {
        return "Grãos";
    }
}
