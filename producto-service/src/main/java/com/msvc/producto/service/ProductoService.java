package com.msvc.producto.service;

import com.msvc.producto.dto.ProductoRequest;
import com.msvc.producto.dto.ProductoResponse;

import java.util.List;

public interface ProductoService {

    void guardarProducto(ProductoRequest request);

    List<ProductoResponse> getAllProductos();

}
