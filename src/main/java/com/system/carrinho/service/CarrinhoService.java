package com.system.checkout.service;

import com.system.checkout.entity.Basket;

public interface CarrinhoService {

    public Carrinho newCarrinho(Carrinho carrinho);

    public Carrinho getCarrinho(Long id);


}
