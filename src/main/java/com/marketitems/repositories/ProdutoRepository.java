package com.marketitems.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.marketitems.domain.items.Produto;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional<Produto> findProdutoById(Long id);
}
