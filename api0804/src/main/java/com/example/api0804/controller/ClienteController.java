package com.example.api0804.controller;

import com.example.api0804.model.ClienteModel;
import com.example.api0804.repository.ClienteRepository;
import com.example.api0804.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<ClienteModel> listarTodos(){
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<Object, String>> salvar(@RequestBody ClienteModel clienteModel){
        service.salvarCliente(clienteModel);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Cliente Cadastrado com sucesso"));

    }

}
