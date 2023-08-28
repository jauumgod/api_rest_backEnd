package com.marketitems.dtos;

import com.marketitems.domain.items.Produto;
import com.marketitems.domain.listadecompras.ListaDeCompras;

public record ListaDeComprasDTO(Produto id_produto, ListaDeCompras id_lista_compras, int quantidade) {
}
