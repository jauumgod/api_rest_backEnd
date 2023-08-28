package com.marketitems.domain.listadecompras;



import com.marketitems.domain.items.Produto;
import com.marketitems.dtos.ListaDeComprasDTO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "lista_compras")
@Table(name = "lista_compras")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@NoArgsConstructor

public class ListaDeCompras {

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

    public ListaDeCompras(ListaDeComprasDTO data){
        this.produto = data.id_produto();
        this.listaDeCompras = data.id_lista_compras();
        this.quantidade = data.quantidade();
    }
    
}















