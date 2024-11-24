package com.msvc.order.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class InventarioResponse {

    private String codigoSku;
    private boolean isInStock;

}
