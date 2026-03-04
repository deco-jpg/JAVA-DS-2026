package com.example.atividade3;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Itau", "0136", "12345",
                "Corrente", 00.00, 00.00);

        Funcionario funcionario1 = new Funcionario("5550", "Antonio", "Av Dendezeiros",
                "719999999", "antonio@gmail.com", contaBancaria1);

        System.out.println("Nome do funcionario: " + funcionario1.getNome());
        System.out.println("Código do funcionario: " + funcionario1.getCodFuncionario());
        System.out.println("Endereço: " + funcionario1.getEndereco());
        System.out.println("Telefone: " + funcionario1.getTelefone());
        System.out.println("Email: " + funcionario1.getEmail());
        System.out.println("------------------------");
        System.out.println("Conta Bancária: " + funcionario1.getContaBancaria().getBanco());
        System.out.println("Agencia: " + funcionario1.getContaBancaria().getAgencia());
        System.out.println("Numero da conta: " + funcionario1.getContaBancaria().getNumeroConta());
        System.out.println("Tipo da Conta: " + funcionario1.getContaBancaria().getTipoConta());
        System.out.println("Saldo atual: " + funcionario1.getContaBancaria().getSaldoAtual());
        System.out.println("Limite Disponivel: " + funcionario1.getContaBancaria().getLimiteDispo());
    }
}
