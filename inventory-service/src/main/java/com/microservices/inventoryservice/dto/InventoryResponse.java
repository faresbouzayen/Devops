package com.microservices.inventoryservice.dto;

import lombok.Data;

@Data
public class InventoryResponse {
    private String skuCode;
    private boolean isInSock;

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public boolean isInSock() {
        return isInSock;
    }

    public void setInSock(boolean inSock) {
        isInSock = inSock;
    }

    public InventoryResponse(String skuCode, boolean isInSock) {
        this.skuCode = skuCode;
        this.isInSock = isInSock;
    }

    public InventoryResponse() {
    }
}
