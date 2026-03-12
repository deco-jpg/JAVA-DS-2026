package org.example.atividade1;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        System.out.println("--------------");
        System.out.println(cachorro.emitirSom());
        System.out.println(cachorro.comer());

        Gato gato = new Gato();
        System.out.println("--------------");
        System.out.println(gato.emitirSom());
        System.out.println(gato.comer());

        Galo galo = new Galo();
        System.out.println("--------------");
        System.out.println(galo.emitirSom());
        System.out.println(galo.comer());

        Pato pato = new Pato();
        System.out.println("--------------");
        System.out.println(pato.emitirSom());
        System.out.println(pato.comer());
    }
}
