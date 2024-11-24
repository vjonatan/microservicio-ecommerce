package com.msvc.inventario.controller;

import com.msvc.inventario.dto.InventarioResponse;
import com.msvc.inventario.service.InventarioService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/inventario")
public class InventarioController {

    @Autowired
    InventarioService inventarioService;

    @GetMapping
    public List<InventarioResponse> isInStock(@RequestParam List<String> codigoSku){
        return inventarioService.isInStock(codigoSku);
    }

}
