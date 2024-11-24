package com.msvc.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderLineItemsDto {

    private Long id;
    private String codigoSku;
    private BigDecimal precio;
    private int cantidad;

}
