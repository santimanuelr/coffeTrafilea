package com.nespresso.coffeTrafilea.repository;

import com.nespresso.coffeTrafilea.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product,String> {
}
