package org.example.charity_app.services;

import org.example.charity_app.entities.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User saveUser(User user);
    User editUser(User user);
    void deleteUser(Long id);
    User createUser(User user);
    User getUsersByCin(String id);
    List<User> getUsers();
    User updateUser(Long id, User user);
    User getUsersById(Long id);

    List<User> getAllUsers();

    User getUserById(Long id);

    User getUserByCin(String id);
}
