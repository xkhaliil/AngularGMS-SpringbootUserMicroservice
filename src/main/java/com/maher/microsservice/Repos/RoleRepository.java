package com.maher.microsservice.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.maher.microsservice.entities.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}