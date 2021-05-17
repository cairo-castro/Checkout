package com.system.checkout.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "basket")
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany()
    @JoinColumn(name = "basket_id")
    private List<ProdutonoCarrinho> produtosnoCarrinho;

    public Carrinho() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProdutonoCarrinho> getProdutosnoCarrinho() {
        return produtosnoCarrinho;
    }

    public void setProdutosnoCarrinho(List<Produto> produto) {
        this.produtosnoCarrinho = produtosnoCarrinho;
    }
}
