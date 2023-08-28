package com.marketitems.domain.items;


import com.marketitems.dtos.ProdutosDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "produto")
@Table(name = "produto")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@NoArgsConstructor

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String itemName;
    private BigDecimal price;
    private int quantity;

    private LocalDateTime time_stamp;


    public Produto(ProdutosDTO data){
        this.itemName = data.itemName();
        this.price = data.price();
        this.quantity = data.quantity();
    }
}
