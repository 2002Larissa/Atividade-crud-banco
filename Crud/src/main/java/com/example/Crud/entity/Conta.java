package com.example.Crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Conta {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long contaId;
    private String titular;
    private String agencia;
    private String numeroConta;


    public Conta(){}
    public Conta(String titular, String agencia, String numeroConta) {
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public Long getContaId() {
        return contaId;
    }
    public void setContaId(Long contaId) {
        this.contaId = contaId;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
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








}
