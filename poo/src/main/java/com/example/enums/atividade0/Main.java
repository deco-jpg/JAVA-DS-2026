package com.example.enums.atividade0;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria",Pedido.ABERTO);
        Cliente cliente2 = new Cliente("Danilo", Pedido.CONCLUIDO);
        // System.out.println("Nome: " + cliente1.getNome());
        // System.out.println("Pedido: " + cliente1.getPedido());
        // System.out.println("---------------");
        // System.out.println("Nome: " + cliente2.getNome());
        // System.out.println("Pedido: " + cliente2.getPedido());

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }

}
