package com.maher.microsservice.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.maher.microsservice.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}