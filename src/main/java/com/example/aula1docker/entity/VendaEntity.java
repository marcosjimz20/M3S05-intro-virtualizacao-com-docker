package com.example.aula1docker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_VENDA")
@AllArgsConstructor
@NoArgsConstructor
public class VendaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private ProdutoEntity produto;

    @ManyToOne
    private ClienteEntity cliente;

    private double desconto;

// Constructor sem id
    public VendaEntity(ProdutoEntity produto, ClienteEntity cliente, double desconto) {
        this.produto = produto;
        this.cliente = cliente;
        this.desconto = desconto;

    }

// Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public ProdutoEntity getProduto() {
        return produto;
    }
    public void setProduto(ProdutoEntity produto) {
        this.produto = produto;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }
    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}
