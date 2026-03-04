package com.example.enums.atividade1;

public class Main {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("F1", "Dan", 3000.00, 
        Setor.Financeiro, Sexo.Masculino, 48);

        Funcionario funcionario2 = new Funcionario("F2", "Maria", 5000.00, 
        Setor.RH, Sexo.Feminino, 45);

        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
    }

}
