package com.maher.microsservice.service;

import com.maher.microsservice.entities.Role;
import com.maher.microsservice.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);

    List<User> findAllUsers();
}

