package com.example.Crud.repository;

import com.example.Crud.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface ContaRepository extends JpaRepository<Conta, Long> {

    }

