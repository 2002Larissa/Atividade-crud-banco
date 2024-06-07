package com.example.Crud.service;

import com.example.Crud.entity.Conta;

import java.util.List;

public interface ContaService {

        Conta salvarConta(Conta conta);

        List<Conta> listarContas();

        Conta getContaById(Long id);

        Conta updateContaById(Long id, Conta employee);

        String deleteContaById(Long id);
    }

