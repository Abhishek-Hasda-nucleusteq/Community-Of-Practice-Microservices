package io.com.user.api.usermanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.com.user.api.usermanagement.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}