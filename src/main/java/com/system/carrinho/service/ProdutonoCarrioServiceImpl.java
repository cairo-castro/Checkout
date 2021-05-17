package com.system.checkout.service;

import com.system.checkout.entity.Carrinho;
import com.system.checkout.entity.ProdutonoCarrinho;
import com.system.checkout.repository.ProdutonoCarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProdutonoCarrinhoServiceImpl implements ProdutonoCarrinhoService {

    @Autowired
    private ProdutonoCarrinhoRepository produtonoCarrinhoRepository;


    @Override
    @Transactional
    public void addProdutoparaCarrinho(ProdutonoCarrinho produtonoCarrinho) {
        produtonoCarrinhoRepository.save(produtonoCarrinho);
    }

    @Override
    @Transactional
    public void addProdutosparaCarrinho(List<ProdutonoCarrinho> produtosnoCarrinho) {
        produtonoCarrinhoRepository.saveAll(produtosnoCarrinho);
    }

}
