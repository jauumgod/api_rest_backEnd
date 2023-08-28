package com.marketitems.domain.Cart;


import jakarta.persistence.*;

@Entity
@Table(name = "carrinho")
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String listname;
}
