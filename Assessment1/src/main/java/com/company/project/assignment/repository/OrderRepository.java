package com.company.project.assignment.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.company.project.assignment.model.Order;
import com.company.project.assignment.model.Product;

public interface OrderRepository extends MongoRepository<Order, String> {

	public Optional<Order> save(Product product);

}