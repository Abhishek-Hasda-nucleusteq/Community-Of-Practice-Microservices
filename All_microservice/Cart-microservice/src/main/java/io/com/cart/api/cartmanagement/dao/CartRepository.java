package io.com.cart.api.cartmanagement.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.com.cart.api.cartmanagement.model.CartItem;

public interface CartRepository extends MongoRepository<CartItem, Long> {

}
