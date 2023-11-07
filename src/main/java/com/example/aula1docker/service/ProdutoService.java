package com.example.aula1docker.service;

import com.example.aula1docker.entity.ProdutoEntity;
import com.example.aula1docker.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public void addProduto(ProdutoEntity produtoEntity) {
        produtoRepository.save(produtoEntity);
    }

    public List<ProdutoEntity> listProduto() {
        return produtoRepository.findAll();
    }

}
