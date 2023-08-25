package com.marketitems.domain.supermarket;

import com.marketitems.dtos.SuperMarketDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "supermarket")
@Table(name = "supermarket")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@NoArgsConstructor

public class SuperMarket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nameSupermarket;

    public SuperMarket(SuperMarketDTO data){
        this.nameSupermarket = data.nameSuperMarket();
    }
}
