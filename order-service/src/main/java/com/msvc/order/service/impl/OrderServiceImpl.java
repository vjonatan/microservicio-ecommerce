package com.msvc.order.service.impl;

import com.msvc.order.dto.OrderLineItemsDto;
import com.msvc.order.dto.OrderRequest;
import com.msvc.order.model.Order;
import com.msvc.order.model.OrderLineItems;
import com.msvc.order.repository.OrderRepository;
import com.msvc.order.service.OrderService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public void placeOrder(OrderRequest orderRequest) {

        Order order = new Order();
        order.setNumeroPedido(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItemsList = orderRequest.getOrderLineItemsDto()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());

        order.setOrderLineItemsList(orderLineItemsList);
        orderRepository.save(order);
        log.info("Order guardado");
    }

    private OrderLineItems mapToDto(OrderLineItemsDto dto){
        return OrderLineItems.builder()
                .precio(dto.getPrecio())
                .cantidad(dto.getCantidad())
                .codigoSku(dto.getCodigoSku())
                .build();
    }
}
