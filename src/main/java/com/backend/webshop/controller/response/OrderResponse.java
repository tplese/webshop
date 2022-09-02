package com.backend.webshop.controller.response;

import com.backend.webshop.model.Order;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderResponse {

    private String customerId;
    private String customerFirstName;
    private String customerLastName;
    private String orderId;
    private Order.Status status;
    private BigDecimal totalPriceHrk;
    private BigDecimal totalPriceEur;
    private List<OrderItemResponse> orderItemList;
}
