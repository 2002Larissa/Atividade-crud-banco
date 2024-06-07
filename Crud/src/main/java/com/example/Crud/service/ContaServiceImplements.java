package com.example.Crud.service;

import com.example.Crud.entity.Conta;
import com.example.Crud.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class ContaServiceImplements implements ContaService {

    @Autowired
    private ContaRepository contaRepository;

    @Override
    public Conta salvarConta (Conta conta) {
        return contaRepository.save(conta);
    }

    @Override
    public List<Conta> listarContas() {
        List<Conta> contas = contaRepository.findAll();
        return contas;
    }

    @Override
    public Conta getContaById(Long id) {
        Optional<Conta> conta = contaRepository.findById(id);
        if (conta.isPresent()) {
            return conta.get();
        }
        return null;
    }

    @Override
    public Conta updateContaById(Long id, Conta conta) {
        Optional<Conta> conta1 = contaRepository.findById(id);

        if (conta1.isPresent()) {
            Conta originalConta = conta1.get();

            if (Objects.nonNull(conta.getTitular()) && !"".equalsIgnoreCase(conta.getTitular())) {
                originalConta.setTitular(conta.getTitular());
            }

            return contaRepository.save(originalConta);
        }
        return null;
    }

    @Override
    public String deleteContaById(Long id) {
        if (contaRepository.findById(id).isPresent()) {
            contaRepository.deleteById(id);
            return "Conta deletada com sucesso";
        }
        return "Essa conta não existe no banco de dados";
    }
}



