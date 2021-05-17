package com.system.checkout.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(nome = "Produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nome = "nome")
    private String nome;

    @Column(nome = "valor")
    private BigDecimal valor;

    public Produto() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPrice() {
        return valor;
    }

    public void setPrice(BigDecimal valor) {
        this.valor = valor;
    }
}
