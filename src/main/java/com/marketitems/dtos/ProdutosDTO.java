package com.marketitems.dtos;

import java.math.BigDecimal;

public record ProdutosDTO(BigDecimal price, String itemName, int quantity) {

}
