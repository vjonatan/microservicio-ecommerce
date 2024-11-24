package com.msvc.inventario.service.impl;

import com.msvc.inventario.dto.InventarioResponse;
import com.msvc.inventario.repository.InventarioRepository;
import com.msvc.inventario.service.InventarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvertarioServiceImpl implements InventarioService {

    @Autowired
    InventarioRepository inventarioRepository;

    @Override
    @Transactional(readOnly = true)
    public List<InventarioResponse> isInStock(List<String> codigoSku) {
        return inventarioRepository.findByCodigoSkuIn(codigoSku).stream()
                .map(inventario ->
                        InventarioResponse.builder()
                                .codigoSku(inventario.getCodigoSku())
                                .inStock(inventario.getCantidad() > 0)
                                .build())
                .collect(Collectors.toList());
    }
}
