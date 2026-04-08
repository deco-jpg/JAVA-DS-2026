package com.example.api0704.controller;

import com.example.api0704.models.AlunoModel;
import com.example.api0704.repository.AlunoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/alunos")
public class AlunoController {
    private AlunoRepository alunoRepository;
    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping
    public List<AlunoModel> listarTodos(){
        return alunoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<AlunoModel> salvar(@RequestBody AlunoModel alunoModel){
        alunoRepository.save(alunoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoModel);
    }

}
