package com.example.api1404.service;

import com.example.api1404.model.FuncionarioModel;
import com.example.api1404.repository.FuncionarioRepository;
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
    public FuncionarioModel salvar(FuncionarioModel funcionario){
        if (repository.findByEmail(funcionario.getEmail()).isPresent()) {
            throw new RuntimeException("Funcionario ja cadastrado");
        }
        return repository.save(funcionario);
    }

    public FuncionarioModel atualizarFuncionario(Long id, FuncionarioModel funcionario) {
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Funcionario nao encontrado.");
        }
        funcionario.setId(id);
        return repository.save(funcionario);
    }

    public void excluir (Long id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Funcionario nao encontrado");
        }
        repository.deleteById(id);
    }
}
