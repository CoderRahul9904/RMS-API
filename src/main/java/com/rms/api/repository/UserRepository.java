package com.rms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rms.api.entity.*;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}