package com.system.checkout.service;

import com.system.checkout.entity.Basket;
import com.system.checkout.entity.ProdutonoCarrinho;
import com.system.checkout.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CarrinhoServiceImpl implements CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @Override
    @Transactional
    public Carrinho newCarrinho(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);
    }

    @Override
    public Carrinho getCarrinho(Long id) {
        return carrinhoRepository.findById(id).get();
    }

}
