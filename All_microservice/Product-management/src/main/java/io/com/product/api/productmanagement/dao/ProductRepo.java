package io.com.product.api.productmanagement.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import io.com.product.api.productmanagement.model.Product;


public interface ProductRepo extends MongoRepository<Product, Integer> {

}
