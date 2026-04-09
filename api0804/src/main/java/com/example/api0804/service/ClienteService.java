package com.example.api0804.service;

import com.example.api0804.model.ClienteModel;
import com.example.api0804.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> listarTodos(){
        return clienteRepository.findAll();
    }
    public ClienteModel salvarCliente(ClienteModel clienteModel) {
        if (clienteRepository.findByEmail(clienteModel.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Cliente já cadastrado");
        }
        return clienteRepository.save(clienteModel);

    }


}
