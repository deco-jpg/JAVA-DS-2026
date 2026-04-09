package com.example.api0804.controller;

import com.example.api0804.model.FuncionarioModel;
import com.example.api0804.service.FuncionarioService;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/funcionarios")
@Table(name = "tab_funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @GetMapping
    public List<FuncionarioModel> listarTodos(){
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<Object, String>> salvar(@RequestBody FuncionarioModel funcionarioModel){
        service.salvarFuncionario(funcionarioModel);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Funcionario cadastrado com sucesso!"));
    }
}
