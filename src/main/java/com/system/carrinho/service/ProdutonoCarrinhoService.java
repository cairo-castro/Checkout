package com.system.checkout.service;

import com.system.checkout.entity.carrinho;
import com.system.checkout.entity.Produtonocarrinho;

import java.util.List;

public interface ProdutonocarrinhoService {

    public void addProdutoparacarrinho(Produtonocarrinho produtonocarrinho);

    public void addProdutosparacarrinho(List<Produtonocarrinho> produtosnocarrinho);

}
