package com.marketitems.domain.Cart;


import com.marketitems.domain.items.Produto;
import com.marketitems.domain.listadecompras.ListaDeCompras;
import jakarta.persistence.*;

@Entity
@Table(name = "carrinho")
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "id_lista")
    private ListaDeCompras listaDeCompras;

    private int quantidade;

}







