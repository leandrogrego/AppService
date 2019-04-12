package com.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{
   Produto findById(long id);
}
