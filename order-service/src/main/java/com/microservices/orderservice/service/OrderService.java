package com.microservices.orderservice.service;

import com.microservices.orderservice.dto.OrderLineItemsDto;
import com.microservices.orderservice.dto.OrderRequest;
import com.microservices.orderservice.model.Order;
import com.microservices.orderservice.model.OrderLineItems;
import com.microservices.orderservice.repository.OrderReposiory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final OrderReposiory orderReposiory;

    public OrderService(OrderReposiory orderReposiory) {
        this.orderReposiory = orderReposiory;
    }

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItemsList = orderRequest.getOrderLineItemsList()
                .stream()
                .map(orderLineItemsDto -> {
                    OrderLineItems orderLineItems = new OrderLineItems();
                    orderLineItems.setPrice(orderLineItemsDto.getPrice());
                    orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
                    orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
                    return orderLineItems;
                })
                .collect(Collectors.toList());


        order.setOrderLineItems(orderLineItemsList);
        orderReposiory.save(order);
    }

}
