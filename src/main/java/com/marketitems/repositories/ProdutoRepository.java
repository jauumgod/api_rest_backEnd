package com.marketitems.repositories;


import com.marketitems.domain.items.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional<Produto> findProdutoById(Long id);
}
