package com.example.Crud.controller;

import com.example.Crud.entity.Conta;
import com.example.Crud.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ContaController {

    @Autowired
    private ContaService ContaService;

    //Salvar conta
    @PostMapping( "/conta" )
    public Conta salvarConta( @RequestBody Conta Conta) {
        return ContaService.salvarConta(Conta);
    }

    //Listar conta
    @GetMapping( "/conta" )
    public List<Conta> getAllEmployees() {
        return ContaService.listarContas();
    }


    //Obter conta por ID
    @GetMapping( "/conta/{id}" )
    public Conta getContaById(@PathVariable( "id" )  Long id ) {
        return ContaService.getContaById(id);
    }

    //Atualizar conta
    @PutMapping( "/conta/{id}" )
    public Conta updateConta( @PathVariable( "id" )  Long id, @RequestBody Conta Conta) {
        return ContaService.updateContaById(id, Conta);
    }

    //Deletar conta
    @DeleteMapping( "/conta/{id}" )
    public String deleteConta( @PathVariable( "id" ) Long id ) {
        return ContaService.deleteContaById(id);
    }
}
