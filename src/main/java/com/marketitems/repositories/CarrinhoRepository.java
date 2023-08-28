package com.marketitems.repositories;

import com.marketitems.domain.Cart.Carrinho;
import com.marketitems.domain.items.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
    Optional<Produto> findCarById(Long id);
}
