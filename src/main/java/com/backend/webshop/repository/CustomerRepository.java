package com.backend.webshop.repository;

import com.backend.webshop.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {
}
