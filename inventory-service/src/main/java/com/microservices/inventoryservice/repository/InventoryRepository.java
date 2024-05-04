package com.microservices.inventoryservice.repository;

import com.microservices.inventoryservice.model.InventoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryModel, Long> {
    Optional<InventoryModel> findBySkuCode(String skuCode);}
