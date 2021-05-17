package com.system.checkout.entity;

import javax.persistence.*;

@Entity(name = "ProdutonoCarrinho")
@Table(name = "Produto_carrinho")
public class ProdutonoCarrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "carrinho_id")
    private Long carrinho_id;

    @Column(name = "produto_id")
    private Long produto_id;

    public ProdutonoCarrinho() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Long produto_id) {
        this.produto_id = produto_id;
    }

    public Long getCarrinho_id() {
        return carrinho_id;
    }

    public void setCarrinho_id(Long carrinho_id) {
        this.carrinho_id = carrinho_id;
    }
}
