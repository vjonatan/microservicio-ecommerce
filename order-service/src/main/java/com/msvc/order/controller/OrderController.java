package com.msvc.order.controller;

import com.msvc.order.dto.OrderRequest;
import com.msvc.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String crearOrden(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Pedido creado satisfactoriamente";
    }
}
