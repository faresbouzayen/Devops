package com.microservices.orderservice.repository;

import com.microservices.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderReposiory extends JpaRepository<Order, String> {

}
