package com.microservices.orderservice.dto;

import com.microservices.orderservice.model.Order;
import com.microservices.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

public class OrderRequest {
    private List<OrderLineItems> orderLineItemsList;

    public OrderRequest(List<OrderLineItems> orderLineItemsList) {
        this.orderLineItemsList = orderLineItemsList;
    }

    public OrderRequest(){}

    public List<OrderLineItems> getOrderLineItemsList() {
        return orderLineItemsList != null ? orderLineItemsList : Collections.emptyList();
    }


    public void setOrderLineItemsList(List<OrderLineItems> orderLineItemsList) {
        this.orderLineItemsList = orderLineItemsList;
    }
}
