package com.system.carrinho.service;

import com.system.carrinho.entity.Produto;
import com.system.carrinho.repository.produtosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutosService {

    @Autowired
    private ProdutoRepository produtosRepository;

    @Override
    public Iterable<Produto> getprodutos() {
        return produtoRepository.findAll();
    }

    @Override
    public List<Produto> getProdutoNome(String nome) {
        return produtoRepository.findAllByNameLike("%"+nome+"%");
    }
}
