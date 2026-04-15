package com.example.api1504.controller;

import com.example.api1504.model.FuncionarioModel;
import com.example.api1504.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional; // Importação adicionada para a busca por ID

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping
    public List<FuncionarioModel> listarFuncionarios() {
        return service.listarTodos();
    }

    // --- NOVO MÉTODO: BUSCA POR ID ---
    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioModel> buscarPorId(@PathVariable Long id) {
        Optional<FuncionarioModel> funcionario = service.buscarPorId(id);

        if (funcionario.isPresent()) {
            return ResponseEntity.ok(funcionario.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody FuncionarioModel funcionario) {
        service.salvar(funcionario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Funcionario salvo com sucesso"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(
            @PathVariable Long id,
            @RequestBody FuncionarioModel funcionario) {
        service.atualizarFuncionario(id, funcionario);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "Funcionario atualizado"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "Funcionario excluido com sucesso"));
    }
}