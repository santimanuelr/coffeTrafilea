package com.nespresso.coffeTrafilea.repository;

import com.nespresso.coffeTrafilea.model.Cart;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CartRepository extends ReactiveMongoRepository<Cart,String> {
}
