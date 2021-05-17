package com.system.carrinho.service;

import com.system.carrinho.entity.Produto;

import java.util.List;

public interface ProdutoService {

public Iterable<Produto> getProduto();

public List<Produto> getProdutoNome(String name);

}
