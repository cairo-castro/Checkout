package com.system.checkout.controller;

import com.system.checkout.entity.Produto;
import com.system.checkout.entity.ProdutonoCarrinho;
import com.system.checkout.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    ProdutosService produtoService;

    @GetMapping("products")
    public Iterable<Produto> getProdutos() {
        return produtoService.getProdutos();

    }

    @GetMapping("products/filter")
    public List<Produto> getProdutosByName(String name) {
      return produtoService.getProdutosByName(name);
    }
}
