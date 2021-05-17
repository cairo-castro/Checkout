package com.system.checkout.repository;

import com.system.checkout.entity.Carrinho;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarrinhoRepository extends CrudRepository<Carrinho, Long>{

}
