package com.example.api.controller;

import com.example.api.model.PetModel;
import com.example.api.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private PetRepository repository;

    @PostMapping
    public PetModel criarPet(@RequestBody PetModel pet){
        return repository.save(pet);
    }

    @GetMapping
    public List<PetModel> listarPets() {
        return repository.findAll();
    }
}
