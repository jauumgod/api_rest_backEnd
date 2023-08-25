package com.marketitems.repositories;

import com.marketitems.domain.items.Items;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface ItemsRepository extends JpaRepository<Items, Long> {

    Optional<Items> findItemsById(Long id);
}
