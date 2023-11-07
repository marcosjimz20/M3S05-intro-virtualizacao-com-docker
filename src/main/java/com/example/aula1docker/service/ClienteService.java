package com.example.aula1docker.service;

import com.example.aula1docker.entity.ClienteEntity;
import com.example.aula1docker.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public void addCliente(ClienteEntity clienteEntity) {
        clienteRepository.save(clienteEntity);
    }

    public List<ClienteEntity> listCliente() {
        return clienteRepository.findAll();
    }

}
