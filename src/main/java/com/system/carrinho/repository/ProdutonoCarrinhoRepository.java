package com.system.checkout.repository;

import com.system.checkout.entity.ProdutonoCarrinho;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutonoCarrinhoRepository extends CrudRepository<ProdutonoCarrinho, Long>{
}
