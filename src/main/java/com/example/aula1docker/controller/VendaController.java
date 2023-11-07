package com.example.aula1docker.controller;

import com.example.aula1docker.entity.VendaEntity;
import com.example.aula1docker.service.VendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class VendaController {

    private final VendaService vendaService;


    // Endpoints
    @PostMapping("venda")
    public VendaEntity addVenda(@RequestParam Long produtoId, @RequestParam Long clienteId, @RequestParam double desconto) {
        return vendaService.addVenda(produtoId, clienteId, desconto);
    }

}
