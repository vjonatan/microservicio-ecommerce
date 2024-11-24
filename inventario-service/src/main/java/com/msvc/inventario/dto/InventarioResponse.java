package com.msvc.inventario.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class InventarioResponse {

    private String codigoSku;
    private boolean inStock;

}
