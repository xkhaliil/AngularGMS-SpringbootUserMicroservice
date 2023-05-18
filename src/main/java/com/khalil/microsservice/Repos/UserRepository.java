package com.khalil.microsservice.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.khalil.microsservice.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}