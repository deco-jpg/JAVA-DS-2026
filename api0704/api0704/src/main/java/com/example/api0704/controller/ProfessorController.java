package com.example.api0704.controller;

import com.example.api0704.models.ProfessorModel;
import com.example.api0704.repository.ProfessorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/professores")
public class ProfessorController {
    private ProfessorRepository professorRepository;
    public ProfessorController (ProfessorRepository professorRepository){
        this.professorRepository = professorRepository;
    }

    @GetMapping
    public List<ProfessorModel> listarTodos(){
        return professorRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<ProfessorModel> salvar (@RequestBody ProfessorModel professorModel){
        professorRepository.save(professorModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(professorModel);
    }
}
