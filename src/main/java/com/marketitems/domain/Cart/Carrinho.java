package com.marketitems.domain.Cart;




import com.marketitems.dtos.CarrinhoDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "carrinho")
@Table(name = "carrinho")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@NoArgsConstructor

public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nome;

    public Carrinho(CarrinhoDTO data){
        this.nome = data.nome();
    }


}







