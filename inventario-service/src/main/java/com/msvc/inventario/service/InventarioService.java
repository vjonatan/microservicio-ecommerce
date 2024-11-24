package com.msvc.inventario.service;

import com.msvc.inventario.dto.InventarioResponse;

import java.util.List;

public interface InventarioService {

    List<InventarioResponse> isInStock(List<String> codigoSku);

}
