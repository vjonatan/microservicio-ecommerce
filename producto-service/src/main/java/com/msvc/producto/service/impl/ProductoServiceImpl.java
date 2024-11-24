package com.msvc.producto.service.impl;

import com.msvc.producto.dto.ProductoRequest;
import com.msvc.producto.dto.ProductoResponse;
import com.msvc.producto.model.Producto;
import com.msvc.producto.repository.ProductoRepository;
import com.msvc.producto.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public void guardarProducto(ProductoRequest request) {

        Producto producto = Producto.builder()
                .nombre(request.getNombre())
                .descripcion(request.getDescripcion())
                .precio(request.getPrecio())
                .build();

        productoRepository.save(producto);
        log.info("El Producto {} ha sido creado", producto.getId());

    }

    @Override
    public List<ProductoResponse> getAllProductos() {

        List<Producto> productos = productoRepository.findAll();

        return productos.stream().map(this::mapToProductoResponse).collect(Collectors.toList());
    }

    private ProductoResponse mapToProductoResponse(Producto producto){
        return ProductoResponse.builder()
                .id(producto.getId())
                .nombre(producto.getNombre())
                .descripcion(producto.getDescripcion())
                .precio(producto.getPrecio())
                .build();
    }
}
