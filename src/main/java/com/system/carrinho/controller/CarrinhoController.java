package com.system.checkout.controller;

import com.system.checkout.entity.Carrinho;
import com.system.checkout.entity.ProdutoAdd;
import com.system.checkout.service.CarrinhoService;
import com.system.checkout.service.ProdutonoCarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;

    @Autowired
    private ProdutoAddService produtonoCarrinhoService;

    @PostMapping("/Carrinho")
    public Carrinho newCarrinho() {
        Carrinho carrinho = new Carrinho();
        return carrinhoService.newCarrinho(carrinho);
    }

    @GetMapping("/carrinho/{id}")
    public Carrinho getCarrinho(@PathVariable Long id){
        return carrinhoService.getCarrinho(id);
    }

    @PostMapping("/carrinho/{id}/addproduto")
    public Carrinho addprodutonoCarrinho(@PathVariable Long id, @RequestBody ProdutonoCarrinho produtonoCarrinho){
        produtonoCarrinho.setCarrinho_id(id);
        produtonoCarrinhoService.addprodutonoCarrinho(produtonoCarrinho);
        return carrinhoService.getCarrinho(id);
    }


    @PostMapping("/carrinho/{id}/addprodutos")
    public Carrinho addProductsToBasket(@PathVariable Long id, @RequestBody List<ProdutonoCarrinho> produtonoCarrinho){
        produtonoCarrinho.forEach(p->p.setCarrinho_id(id));
        produtonoCarrinhoService.addprodutonoCarrinho(produtonoCarrinho);
        return carrinhoService.getCarrinho(id);
    }

}
