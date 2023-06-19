package io.com.payment.api.paymentmanagement.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.com.payment.api.paymentmanagement.model.Wallet;

public interface WalletRepository extends MongoRepository<Wallet, Long>{

}
