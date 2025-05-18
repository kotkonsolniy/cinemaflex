package org.example.repository;

import org.example.model.User;

public interface UserRepository {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    User getUserById(int id);
    User getUserByEmail(String email);
}