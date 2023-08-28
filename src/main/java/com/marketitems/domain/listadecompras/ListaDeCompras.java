package com.marketitems.domain.listadecompras;

import com.marketitems.dtos.ListaDeComprasDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "supermarket")
@Table(name = "supermarket")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@NoArgsConstructor

public class ListaDeCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nomeLista;


    public ListaDeCompras(ListaDeComprasDTO data){
        this.nomeLista = data.nomeListaCompras();
    }
}
