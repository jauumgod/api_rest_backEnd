package com.marketitems.repositories;

import com.marketitems.domain.listadecompras.ListaDeCompras;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemListaRepository extends JpaRepository<ListaDeCompras, Long> {
    
}
