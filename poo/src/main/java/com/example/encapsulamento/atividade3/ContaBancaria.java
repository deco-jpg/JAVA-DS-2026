package com.example.encapsulamento.atividade3;

public class ContaBancaria {
    //Atributos
    private String banco;
    private String agencia;
    private String numeroConta;
    private String tipoConta;
    private double saldoAtual;
    private double limiteDispo;

    //Constructor


    public ContaBancaria(String banco, String agencia, String numeroConta, String tipoConta, double saldoAtual, double limiteDispo) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldoAtual = saldoAtual;
        this.limiteDispo = limiteDispo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getLimiteDispo() {
        return limiteDispo;
    }

    public void setLimiteDispo(double limiteDispo) {
        this.limiteDispo = limiteDispo;
    }
}
