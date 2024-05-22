package com.company.project.assignment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.company.project.assignment.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}