package com.backend.webshop.repository;

import com.backend.webshop.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<Order, UUID> {
}
