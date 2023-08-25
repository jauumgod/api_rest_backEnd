package com.marketitems.domain.items;


import com.marketitems.dtos.ItemsDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "items")
@Table(name = "items")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@NoArgsConstructor

public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String itemName;
    private BigDecimal amount;
    private int quantity;

    private LocalDateTime time_stamp;


    public Items(ItemsDTO data){
        this.itemName = data.itemName();
        this.amount = data.amount();
        this.quantity = data.quantity();
    }
}
