package com.marketitems.dtos;

import java.math.BigDecimal;

public record ItemsDTO( BigDecimal amount, String itemName, int quantity) {

}
