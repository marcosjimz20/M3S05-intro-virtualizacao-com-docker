package com.example.aula1docker.controller;

import com.example.aula1docker.entity.ProdutoEntity;
import com.example.aula1docker.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;


// Endpoints
    @PostMapping("produto")
    public void addProduto(@RequestBody  ProdutoEntity produto) {
        produtoService.addProduto(produto);
    }

    @GetMapping("lista-produtos")
    public List<ProdutoEntity> listProduto() {
        return produtoService.listProduto();
    }
}
