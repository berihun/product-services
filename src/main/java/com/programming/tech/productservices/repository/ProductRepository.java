package com.programming.tech.productservices.repository;

import com.programming.tech.productservices.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
