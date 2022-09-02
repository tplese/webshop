package com.backend.webshop.repository;

import com.backend.webshop.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<Product, UUID> {
}
