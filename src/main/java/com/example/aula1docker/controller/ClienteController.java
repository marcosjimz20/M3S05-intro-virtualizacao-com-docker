package com.example.aula1docker.controller;

import com.example.aula1docker.entity.ClienteEntity;
import com.example.aula1docker.entity.ProdutoEntity;
import com.example.aula1docker.service.ClienteService;
import com.example.aula1docker.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;


// Endpoints
    @PostMapping("cliente")
    public void addCliente(@RequestBody ClienteEntity cliente) {
        clienteService.addCliente(cliente);
    }

    @GetMapping("lista-clientes")
    public List<ClienteEntity> listCliente() {
        return clienteService.listCliente();
    }
}
