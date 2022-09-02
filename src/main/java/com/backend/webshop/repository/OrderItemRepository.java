package com.backend.webshop.repository;

import com.backend.webshop.model.OrderItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface OrderItemRepository extends CrudRepository<OrderItem, UUID> {
    List<OrderItem> findOrderItemsByOrder_Id(UUID id);
}
