package com.example.aula1docker.service;

import com.example.aula1docker.entity.ClienteEntity;
import com.example.aula1docker.entity.ProdutoEntity;
import com.example.aula1docker.entity.VendaEntity;
import com.example.aula1docker.repository.ClienteRepository;
import com.example.aula1docker.repository.ProdutoRepository;
import com.example.aula1docker.repository.VendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VendaService {

    private final VendaRepository vendaRepository;

    private final ProdutoRepository produtoRepository;

    private final ClienteRepository clienteRepository;



    public VendaEntity addVenda(Long produtoId, Long clienteId, double desconto) {

        ProdutoEntity produto = produtoRepository.findById(produtoId).get();

        ClienteEntity cliente = clienteRepository.findById(clienteId).get();

        return vendaRepository.save(new VendaEntity(produto, cliente, desconto));
    }


}
