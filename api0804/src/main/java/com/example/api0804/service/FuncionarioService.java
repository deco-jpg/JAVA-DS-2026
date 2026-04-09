package com.example.api0804.service;

import com.example.api0804.model.FuncionarioModel;
import com.example.api0804.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioModel> listarTodos(){
        return repository.findAll();
    }
    public FuncionarioModel salvarFuncionario(FuncionarioModel funcionarioModel){
        if (repository.findByEmail(funcionarioModel.getEmail()).isPresent()){
            throw new IllegalArgumentException("Funcionario já cadastrado");
        }
        return repository.save(funcionarioModel);
    }
}
