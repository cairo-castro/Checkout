package com.system.checkout.repository;

import com.system.checkout.entity.Produto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdutosRepository extends CrudRepository<Produto, Long> {

    public List<Produto> findAllByNameLike(String nome);
}
