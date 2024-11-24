package com.msvc.order.service;

import com.msvc.order.dto.OrderRequest;

public interface OrderService {

    void placeOrder(OrderRequest orderRequest);

}
