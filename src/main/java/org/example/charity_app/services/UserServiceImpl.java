package org.example.charity_app.services;

import org.example.charity_app.entities.Role;
import org.example.charity_app.entities.User;
import org.example.charity_app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER); // par défaut
        return userRepository.save(user);
    }

    @Override
    public User editUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public User getUserByCin(String id) {
        return null;
    }

    @Override
    public User updateUser(Long id, User updatedUser) {
        User user = getUserById(id);
        user.setFirstName(updatedUser.getFirstName());
        user.setLastName(updatedUser.getLastName());
        user.setEmail(updatedUser.getEmail());
        user.setPassword(updatedUser.getPassword());
        return userRepository.save(user);
    }

    @Override
    public User getUsersById(Long id) {
        return null;
    }


    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User getUsersByCin(String id) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return List.of();
    }
}
