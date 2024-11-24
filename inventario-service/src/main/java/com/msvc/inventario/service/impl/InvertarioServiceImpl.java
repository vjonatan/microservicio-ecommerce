package com.msvc.inventario.service.impl;

import com.msvc.inventario.repository.InventarioRepository;
import com.msvc.inventario.service.InventarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InvertarioServiceImpl implements InventarioService {

    @Autowired
    InventarioRepository inventarioRepository;

    @Override
    @Transactional(readOnly = true)
    public boolean isInStock(String codigoSku) {
        return inventarioRepository.findByCodigoSku(codigoSku).isPresent();
    }
}
