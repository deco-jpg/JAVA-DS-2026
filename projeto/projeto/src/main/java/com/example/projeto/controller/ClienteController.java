package com.example.projeto.controller;

import com.example.projeto.models.ClienteModel;
import com.example.projeto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired //Pode usar no lugar do constructor
    private ClienteRepository repository;

    @GetMapping
    public List <ClienteModel> listar(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<ClienteModel>salvar(@RequestBody ClienteModel model) {
        repository.save(model);

        return ResponseEntity.status(HttpStatus.CREATED).body(model);
    }
}
